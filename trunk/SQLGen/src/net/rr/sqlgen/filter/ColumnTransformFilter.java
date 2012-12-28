package net.rr.sqlgen.filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.rr.sqlgen.core.Row;

import org.apache.commons.lang.StringUtils;

/**
 * @author raksrao
 * 
 */
public class ColumnTransformFilter implements IRowFilter {

	private List<ColumnTransformInfo> params = new ArrayList<ColumnTransformInfo>();

	public ColumnTransformFilter() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("columntransform.props"));

		for (Object columnName : props.keySet()) {
			ColumnTransformInfo info = new ColumnTransformInfo();
			Map<String, String> transformMap = new HashMap<String, String>();
			List<String> transformPairs = new ArrayList<String>(Arrays.asList(StringUtils.split(props
					.getProperty((String) columnName), ',')));

			// Get the type of transform
			info.setTransformType(TransformType.valueOf(transformPairs.get(0)));
			transformPairs.remove(0);

			// Get the pairs of from:to
			for (String transPair : transformPairs) {
				String[] transformPairArray = StringUtils.split(transPair, ':');
				transformMap.put(transformPairArray[0], transformPairArray[1]);
			}

			info.setColumnName((String) columnName);
			info.setTransformMap(transformMap);

			params.add(info);
		}
	}

	@Override
	public Row filter(Row input) {
		for (String col : input.getColumns()) {
			for (ColumnTransformInfo info : params) {
				if (info.getColumnName().equalsIgnoreCase(col)) {
					performFilter(input, info);
					break;
				}
			}
		}
		return input;
	}

	private void performFilter(Row input, ColumnTransformInfo info) {
		switch (info.getTransformType()) {
		case EXACT:
			input.setRowElement(info.getColumnName(), info.getTransformMap().get(
					input.getRowElement(info.getColumnName())));
			break;
		case MATCH:
			String finalString = (String) input.getRowElement(info.getColumnName());
			for (String key : info.getTransformMap().keySet()) {
				if (StringUtils.contains(finalString, key)) {
					finalString = finalString.replace(key, info.getTransformMap().get(key));
				}
			}
			input.setRowElement(info.getColumnName(), finalString);
			break;
		case REGEX:
			System.out.println("Not supported!!!");
			break;
		default:
			System.out.println("Unknown transform type: " + info.getTransformType());
		}

	}

	@Override
	public void setParams(Map<String, Object> params) {
		// this.params = params;
	}

	class ColumnTransformInfo {

		private String columnName;
		private Map<String, String> transformMap;
		private TransformType transformType;

		public void setTransformType(TransformType transformType) {
			this.transformType = transformType;
		}

		public TransformType getTransformType() {
			return transformType;
		}

		public void setTransformMap(Map<String, String> transformMap) {
			this.transformMap = transformMap;
		}

		public Map<String, String> getTransformMap() {
			return transformMap;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnName() {
			return columnName;
		}
	}

	enum TransformType {
		EXACT, REGEX, MATCH;
	}
}
