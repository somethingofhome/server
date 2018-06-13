package me.leig.happenathomeserver.photo.bean;

import me.leig.happenathomeserver.comm.BaseResponse;
import me.leig.happenathomeserver.dao.model.File;

/**
 * 响应文件对象
 *
 * @author leig
 * @version 20180301
 *
 */

public class ResponsePhoto extends BaseResponse {
	
	// 文件对象
	private File data;

	public File getData() {
		return data;
	}

	public void setData(File data) {
		this.data = data;
	}
}
