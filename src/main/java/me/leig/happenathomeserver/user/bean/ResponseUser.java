package me.leig.happenathomeserver.user.bean;

import java.util.Date;

import me.leig.happenathomeserver.comm.BaseResponse;
import me.leig.happenathomeserver.dao.model.User;

/**
 * 响应用户信息
 *
 * @author leig
 * @version 20180301
 *
 */

public class ResponseUser extends BaseResponse {

    private Integer id;

	private Integer fid;

	private String fname;
	
	private Date createtime;

	private Date updatetime;

	private String username;

	private String realname;

	private String headimg;

	public ResponseUser() {}
	
	public ResponseUser(User user) {
		this.id = user.getId();
		this.fid = user.getFid();
		this.fname = user.getFname();
		this.createtime = user.getCreatetime();
		this.updatetime = user.getUpdatetime();
		this.username = user.getUsername();
		this.realname = user.getRealname();
		this.headimg = user.getHeadimg();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getHeadimg() {
		return headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	
}
