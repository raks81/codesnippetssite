package net.rr.sqlgen.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Row {
	private Map<String, Object> rowElements = new HashMap<String, Object>();

	public Object getRowElement(String colName) {
		return rowElements.get(colName);
	}

	public void setRowElement(String colName, Object rowValue) {
		rowElements.put(colName, rowValue);
	}

	public Set<String> getColumns() {
		return rowElements.keySet();
	}
}
