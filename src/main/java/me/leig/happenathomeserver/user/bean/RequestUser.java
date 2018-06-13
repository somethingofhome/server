package me.leig.happenathomeserver.user.bean;

/**
 * 用户登录请求对象
 *
 * @author leig
 * @version 20180301
 *
 */
public class RequestUser {
	
	private String username;
	
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
