package me.leig.happenathomeserver.comm;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public abstract class BaseModel {
	
	private int start;
	
	private int limit = Constant.limit;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
