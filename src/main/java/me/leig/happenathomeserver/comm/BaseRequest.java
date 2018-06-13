package me.leig.happenathomeserver.comm;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public abstract class BaseRequest {
	
	// 当前页
	public int page;
	
	// 请求记录数
	public int limit = Constant.limit;

}
