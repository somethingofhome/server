package me.leig.happenathomeserver.notes.bean;

import java.util.Date;

import me.leig.happenathomeserver.comm.BaseRequest;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public class RequestNotes extends BaseRequest {
	
	private Integer id;
	
    private String title;

    private Integer gid;

    private String name;
    
    private String content;
    
    private String remark;
    
    private Date starttime;

    private Date endtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

}
