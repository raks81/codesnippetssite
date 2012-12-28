package net.rr.sqlgen.core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.rr.sqlgen.util.SQLGenUtils;

public class SQLGenTableRelationEvaluator {

	private Map<String, Table> tables = new HashMap<String, SQLGenTableRelationEvaluator.Table>();

	public static void main(String[] args) throws SQLException {
		Connection conn = SQLGenUtils.getDB2Connection("jdbc:db2://srtidev001:60008/FERRET:returnAlias=0;", "db2inst3",
				"db2inst3");//
		System.out.println("Got Connection.");
		Statement st = conn.createStatement();
		String startTable = "T_LC_TYPE";
		DatabaseMetaData meta = conn.getMetaData();
		SQLGenTableRelationEvaluator tre = new SQLGenTableRelationEvaluator();

		ResultSet rs = meta.getTables(conn.getCatalog(), "CMC", "%", null);
		while (rs.next()) {
			tre.populateMetadata(conn, rs.getString(3), meta);
		}

		System.out.println(tre.getTables().values());
		st.close();
		conn.close();
	}

	private void populateMetadata(Connection conn, String startTable, DatabaseMetaData meta) throws SQLException {
		if (getTables().get(startTable) == null) {
			getTables().put(startTable, new Table(startTable));
		}

		ResultSet rs = meta.getExportedKeys(conn.getCatalog(), "CMC", startTable.toUpperCase());
		while (rs.next()) {
			String fkTableName = rs.getString("FKTABLE_NAME");
			String fkColumnName = rs.getString("FKCOLUMN_NAME");
			//System.out.println("FK: " + fkTableName + "." + fkColumnName);
			if (getTables().get(fkTableName) == null) {
				populateMetadata(conn, fkTableName, meta);
				getTables().get(startTable).fkTables.add(getTables().get(fkTableName));
			}
		}
	}

	public void setTables(Map<String, Table> tables) {
		this.tables = tables;
	}

	public Map<String, Table> getTables() {
		return tables;
	}

	public class Table {
		public String name;
		public List<Table> fkTables = new ArrayList<SQLGenTableRelationEvaluator.Table>();

		public Table(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name + "\t\t\t FK: " + fkTables.size() + "\n";
		}
	}
}
