package me.leig.happenathomeserver.dao.model;

import java.io.Serializable;
import java.util.Date;

import me.leig.happenathomeserver.comm.BaseModel;
import me.leig.happenathomeserver.comm.Constant;

public class File extends BaseModel implements Serializable {

	private Integer id;

    private String title;

    private Integer filetype;

    private String mimetype;

    private Long filesize;

    private Date createtime;

    private Date uploadtime;

    private Date updatetime;

    private Date deletetime;

    private Integer deleteflag = Constant.status_normal;

    private String content;

    private String saveurl;

    private String tempurl;

    private String longitude;

    private String latitude;

    private static final long serialVersionUID = 1L;

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
        this.title = title == null ? null : title.trim();
    }

    public Integer getFiletype() {
        return filetype;
    }

    public void setFiletype(Integer filetype) {
        this.filetype = filetype;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype == null ? null : mimetype.trim();
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSaveurl() {
        return saveurl;
    }

    public void setSaveurl(String saveurl) {
        this.saveurl = saveurl == null ? null : saveurl.trim();
    }

    public String getTempurl() {
        return tempurl;
    }

    public void setTempurl(String tempurl) {
        this.tempurl = tempurl == null ? null : tempurl.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", filetype=").append(filetype);
        sb.append(", mimetype=").append(mimetype);
        sb.append(", filesize=").append(filesize);
        sb.append(", createtime=").append(createtime);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", deletetime=").append(deletetime);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", content=").append(content);
        sb.append(", saveurl=").append(saveurl);
        sb.append(", tempurl=").append(tempurl);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}