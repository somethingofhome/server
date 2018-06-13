package me.leig.happenathomeserver.photo.bean;

import me.leig.happenathomeserver.comm.BaseRequest;
import me.leig.happenathomeserver.dao.model.File;

/**
 * 请求参数
 *
 * @author leig
 * @version 20180301
 *
 */

public class RequestPhoto extends BaseRequest {

	// 文件对象
	private File data;
	
	public File getData() {
		return data;
	}

	public void setData(File data) {
		this.data = data;
	}
}