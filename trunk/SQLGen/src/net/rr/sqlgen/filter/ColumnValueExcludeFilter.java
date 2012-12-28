package net.rr.sqlgen.filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.rr.sqlgen.core.Row;

import org.apache.commons.lang.StringUtils;

public class ColumnValueExcludeFilter implements IRowFilter {

	private Map<String, Object> params = new HashMap<String, Object>();

	public ColumnValueExcludeFilter() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("columnexclude.props"));
		for (Object columnName : props.keySet()) {
			params.put(columnName.toString(), props.get(columnName));
		}
	}

	@Override
	public Row filter(Row input) {
		for (String col : input.getColumns()) {
			if (params.containsKey(col)) {
				String[] excludeValues = StringUtils.split((String) params.get(col), ',');
				for (String excludeValue : excludeValues) {
					if (input.getRowElement(col) != null
							&& excludeValue.equalsIgnoreCase(input.getRowElement(col).toString())) {
						return null;
					}
				}
			}
		}
		return input;
	}

	@Override
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
