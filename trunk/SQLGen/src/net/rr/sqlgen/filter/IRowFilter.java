package net.rr.sqlgen.filter;

import java.util.Map;

import net.rr.sqlgen.core.Row;

public interface IRowFilter {
	public Row filter(Row input);
	
	public void setParams(Map<String, Object> params); 
}
