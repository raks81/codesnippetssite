package net.rr.sqlgen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class SQLGenUtils {
	public static final Connection getDB2Connection(String url, String user, String password) throws SQLException {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(url, user, password);
	}

	public static final Map<Integer, String> getColumns(Connection con, String table) throws SQLException {
		String sql = "select * from " + table + " fetch first 2 rows only";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData md = rs.getMetaData();
		int rowCount = md.getColumnCount();
		Map<Integer, String> columns = new HashMap<Integer, String>();
		for (int i = 1; i <= rowCount; i++) {
			columns.put(i, md.getColumnName(i));
		}
		return columns;
	}
}
