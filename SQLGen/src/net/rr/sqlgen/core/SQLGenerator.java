package net.rr.sqlgen.core;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import net.rr.sqlgen.filter.IRowFilter;

import org.apache.commons.lang.StringUtils;

public class SQLGenerator {
	private static final Integer MAX_ROWS_PER_FETCH = 1000;
	private static final Logger LOG = Logger.getLogger(SQLGenerator.class.getName());

	private List<Integer> stringTypes = Arrays.asList(Types.CHAR, Types.LONGNVARCHAR, Types.VARCHAR, Types.TIMESTAMP,
			Types.TIME, Types.DATE, Types.CLOB);

	public void getSQLInserts(Connection con, String tableName, Collection<String> columnsToInclude, Properties props,
			OutputStream os) throws SQLException, IllegalAccessException, InstantiationException,
			ClassNotFoundException, IOException {
		// Get metadata
		String sqlm = "select * from " + tableName + " fetch first 1 rows only";
		Statement stm = con.createStatement();
		ResultSet rsm = stm.executeQuery(sqlm);
		ResultSetMetaData md = rsm.getMetaData();
		int rowCount = md.getColumnCount();
		Map<Integer, String> columns = new HashMap<Integer, String>();
		for (int i = 1; i <= rowCount; i++) {
			if (columnsToInclude.contains(md.getColumnName(i)))
				columns.put(i, md.getColumnName(i));
		}
		//LOG.info("Generated keys: " + stm.getGeneratedKeys().toString());

		// Prepare the filters
		String[] filterClasses = StringUtils.split(props.getProperty("rowfilters"), ',');
		List<IRowFilter> filters = new ArrayList<IRowFilter>();
		if (filterClasses != null) {
			for (String filterClass : filterClasses) {
				filters.add((IRowFilter) Class.forName(filterClass).newInstance());
			}
		}

		
		// Get data
		String sql = "select * from " + tableName + " fetch first " + MAX_ROWS_PER_FETCH + " rows only";
		Statement st = con.createStatement();
		st.setFetchSize(MAX_ROWS_PER_FETCH);
		ResultSet rs = st.executeQuery(sql);
		rs.setFetchSize(MAX_ROWS_PER_FETCH);
		StringBuffer sqlString = new StringBuffer();
		while (rs.next()) {

			// Get the row object
			Row row = new Row();
			for (Integer column : columns.keySet()) {
				String value = rs.getString(column);
				if (stringTypes.contains(md.getColumnType(column))) {
					// Escape apostrophes
					if (value != null)
						value = value.replaceAll("'", "''");
					value = "'" + value + "'";
				}
				row.setRowElement(md.getColumnName(column), value);
			}

			// Run it through the filters
			for (IRowFilter filter : filters) {
				if (row != null) {
					row = filter.filter(row);
				}
			}

			if (row != null) {
				String columnAsString = StringUtils.join(row.getColumns(), ", ");
				sqlString.append("INSERT INTO " + tableName + " (" + columnAsString + ") VALUES (");
				for (String column : row.getColumns()) {
					if (row.getRowElement(column) != null) {
						sqlString.append(row.getRowElement(column).toString()).append(", ");
					} else {
						sqlString.append("NULL").append(", ");
					}
				}
				sqlString.replace(sqlString.lastIndexOf(", "), sqlString.length() - 1, "");
				sqlString.append(");\n");
				os.write(sqlString.toString().getBytes());
				os.flush();
			}
		}
	}
}
