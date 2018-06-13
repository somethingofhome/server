package me.leig.happenathomeserver.photo.bean;

import java.util.List;

import me.leig.happenathomeserver.comm.BaseResponse;
import me.leig.happenathomeserver.dao.model.File;

/**
 * 响应文件集合对象
 *
 * @author leig
 * @version 20180301
 *
 */

public class ResponsePhotos extends BaseResponse {
	
	// 文件对象集合
	private List<File> files;
	
	// 记录总数
	private int recordCount;
	
	// 页码总数
	private int pageCount;

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
