package me.leig.happenathomeserver.dao.model;

import java.util.Date;

import me.leig.happenathomeserver.comm.BaseModel;
import me.leig.happenathomeserver.comm.Constant;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public class NotesExt01 extends BaseModel {

    private Integer id;
	
    private String title;

    private Integer gid;

    private String name;
    
    private String content;
    
    private String remark;
    
    private Date starttime;

    private Date endtime;
	
    private Date createtime;

    private Date updatetime;

    private Date deletetime;

    private Integer deleteflag = Constant.status_normal;
    
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

	public Date getDeletetime() {
		return deletetime;
	}

	public void setDeletetime(Date deletetime) {
		this.deletetime = deletetime;
	}

	public Integer getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(Integer deleteflag) {
		this.deleteflag = deleteflag;
	}
    
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", gid=").append(gid);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", remark=").append(remark);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", deletetime=").append(deletetime);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}
