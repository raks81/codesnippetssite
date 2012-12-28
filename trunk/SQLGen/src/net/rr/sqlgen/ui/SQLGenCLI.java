package net.rr.sqlgen.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

import net.rr.sqlgen.core.SQLGenerator;
import net.rr.sqlgen.util.SQLGenUtils;

import org.apache.commons.lang.StringUtils;

public class SQLGenCLI {

	Properties props;

	public SQLGenCLI(Properties props) {
		this.props = props;
	}

	public static void main(String[] args) throws SQLException, IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
		Properties props = new Properties();
		props.load(new FileInputStream("sqlgen.props"));
		new SQLGenCLI(props).start();
	}

	private void start() throws SQLException, IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {

		//enter jdbc url
		String url = getUserInput("Enter JDBC URL", "url");

		//enter username
		String user = getUserInput("Enter user name", "username");

		//enter password
		String password = getUserInput("Enter password", "password");

		//Connect to DB
		System.out.println("Connection to db...");
		Connection con = SQLGenUtils.getDB2Connection(url, user, password);

		//get schemas
		String schema = getUserInput("Enter schema name", "schema");

		//get tables
		String table = getUserInput("Enter table", "table");

		//print columns
		Map<Integer, String> columns = SQLGenUtils.getColumns(con, schema + "." + table);
		for (Integer columnIndex : columns.keySet()) {
			System.out.println(columnIndex + " = " + columns.get(columnIndex));
		}

		//get exclude columns
		String excludeColumns = getUserInput("Enter columns to exclude (comma separated, type INCALL to include all columns)", "");
		Collection<String> columnsToInclude = getIncludeColumns(columns, excludeColumns);
		System.out.println("Including columns: " + columnsToInclude);

		//enter filename
		//String fileName = getUserInput("Enter output file name", "outputfile");

		//write file
		File f = new File(schema + "." + table + ".sql");
		FileOutputStream fos = new FileOutputStream(f);
		new SQLGenerator().getSQLInserts(con, schema + "." + table, columnsToInclude, props, fos);
		System.out.println("Wrote SQLs to " + f.getAbsolutePath());

		fos.flush();
		fos.close();
		props.store(new FileOutputStream("sqlgen.props"), "");
		con.close();
	}

	private String getUserInput(String message, String key) throws FileNotFoundException, IOException {
		Scanner console = new Scanner(System.in);
		if (console != null) {
			System.out.print(message + " (Current val: " + props.getProperty(key) + ") =>");
			String readVal = console.nextLine();
			if (StringUtils.isEmpty(readVal)) {
				return props.getProperty(key);
			} else {
				props.put(key, readVal);
				props.store(new FileOutputStream("sqlgen.props"), "");
				return readVal;
			}
		}
		throw new RuntimeException("Cannot read from console");
	}

	private Collection<String> getIncludeColumns(Map<Integer, String> columns, String excludeColumns) {
		if (excludeColumns == null || "".equals(excludeColumns) || "INCALL".equalsIgnoreCase(excludeColumns))
			return columns.values();
		StringTokenizer tokenizer = new StringTokenizer(excludeColumns, ",");
		while (tokenizer.hasMoreElements()) {
			columns.remove(Integer.parseInt(tokenizer.nextToken().trim()));
		}
		return columns.values();
	}
}
