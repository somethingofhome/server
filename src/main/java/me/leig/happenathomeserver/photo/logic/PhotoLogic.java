package me.leig.happenathomeserver.photo.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.leig.happenathomeserver.comm.Constant;
import me.leig.happenathomeserver.comm.Toolbox;
import me.leig.happenathomeserver.dao.mapper.FileMapper;
import me.leig.happenathomeserver.dao.model.File;
import me.leig.happenathomeserver.photo.bean.RequestPhoto;
import me.leig.happenathomeserver.photo.bean.ResponsePhoto;
import me.leig.happenathomeserver.photo.bean.ResponsePhotos;

/**
 * 照片操作服务
 *
 * @author leig
 * @version 20180301
 *
 */
@Service
public class PhotoLogic {
	
	/**
	 * 照片持久化操作
	 */
	@Autowired
	private FileMapper fileMapper;
	
	/**
	 * 通过照片对象获取照片集合
	 * 
	 * @param rPhoto
	 */
	public ResponsePhotos findPhotos(RequestPhoto rPhoto) {
		// 准备返回对象
		ResponsePhotos responseFiles = new ResponsePhotos();
		
		File file = rPhoto.getData();

		// 初始化参数
		if (null == file) {
			file = new File();
		}

		file.setDeleteflag(Constant.status_normal);
		file.setFiletype(Constant.type_photo);
		file.setStart(Toolbox.pageToStart(rPhoto.page, rPhoto.limit));
		file.setLimit(rPhoto.limit);
		
		// 查询记录数
		int total = fileMapper.recordCount(file);
		
		if (0 >= total) {
			responseFiles.setErrorFlag(true);
			responseFiles.setErrorCode("fileMapper.recordCount() failed");
			responseFiles.setErrorMsg("查询总记录数为空");
			return responseFiles;
		}
		
		// 查询记录集合
		List<File> files = fileMapper.findFiles(file);
		
		responseFiles.setRecordCount(total);
		responseFiles.setPageCount(Toolbox.pageForTotal(total, rPhoto.limit));
		
		responseFiles.setFiles(files);

		return responseFiles;
	}
	
	/**
	 * 添加照片
	 * 
	 * @param rPhoto
	 * @return
	 */
	public ResponsePhoto addPhoto(RequestPhoto rPhoto) {
		// 准备返回参数
		ResponsePhoto responseFile = new ResponsePhoto();
		
		File file = rPhoto.getData();

		// 参数验证
		if (null == file) {
			responseFile.setErrorFlag(true);
			responseFile.setErrorCode("PhotoLogic.addPhoto() failed");
			responseFile.setErrorMsg("添加对象不能为空");
			return responseFile;
		}
		
		if (0 < file.getId() || null == file.getTempurl() || "".equals(file.getTempurl())) {
			responseFile.setErrorFlag(true);
			responseFile.setErrorCode("PhotoLogic.addPhoto() failed");
			responseFile.setErrorMsg("参数错误");
			return responseFile;
		}
		
		// 初始化参数
		file.setDeleteflag(Constant.status_normal);
		file.setFiletype(Constant.type_photo);
		if (null == file.getCreatetime()) {
			file.setCreatetime(new Date());	
		}
		file.setUpdatetime(new Date());
		file.setUploadtime(new Date());
		
		
		// 添加操作
		int result = fileMapper.addFile(file);
		
		if (0 >= result) {
			responseFile.setErrorFlag(true);
			responseFile.setErrorCode("PhotoLogic.addPhoto() failed");
			responseFile.setErrorMsg("添加失败");
		}
		
		responseFile.setData(file);
		
		return responseFile;
	}
	
	/**
	 * 批量添加照片
	 * 
	 * @param requestFiles
	 * @return
	 */
	@Transactional
	public ResponsePhotos addPhotos(List<RequestPhoto> requestPhotos) {
		// 准备返回参数
		ResponsePhotos responsePhotos = new ResponsePhotos();
		
		// 参数验证
		if (null == requestPhotos || 0 == requestPhotos.size()) {
			responsePhotos.setErrorFlag(true);
			responsePhotos.setErrorCode("PhotoLogic.addPhotos() failed");
			responsePhotos.setErrorMsg("参数不能为空");
			return responsePhotos;
		}
		
		List<File> files = new ArrayList<>();
		
		// 批量添加
		for (RequestPhoto rPhoto: requestPhotos) {
			ResponsePhoto responsePhoto = addPhoto(rPhoto);
			if(responsePhoto.isErrorFlag()) {
				throw new RuntimeException();
			}
			files.add(responsePhoto.getData());
		}
		
		responsePhotos.setFiles(files);
		
		return responsePhotos;
	}
	
	/**
	 * 更新照片
	 * 
	 * @param rPhoto
	 * @return
	 */
	public ResponsePhoto updatePhoto(RequestPhoto rPhoto) {
		// 准备返回参数
		ResponsePhoto responsePhoto = new ResponsePhoto();
		
		// 参数验证
		File file = rPhoto.getData();
		
		if (null == file || 0 >= file.getId()) {
			responsePhoto.setErrorFlag(true);
			responsePhoto.setErrorCode("PhotoLogic.updatePhoto() failed");
			responsePhoto.setErrorMsg("更新对象不能为空");
			return responsePhoto;
		}
		
		// 初始化参数
		if (null == file.getUpdatetime()) {
			file.setUpdatetime(new Date());
		}
		
		// 照片更新操作
		int result = fileMapper.updateFile(file);
		
		if (0 >= result) {
			responsePhoto.setErrorFlag(true);
			responsePhoto.setErrorCode("PhotoLogic.updatePhoto() failed");
			responsePhoto.setErrorMsg("更新失败");
			return responsePhoto;
		}
		
		return responsePhoto;
	}
	
	/**
	 * 批量更新
	 * 
	 * @param rPhotos
	 * @return
	 * @throws Exception 
	 */
	@Transactional
	public ResponsePhotos updatePhotos(List<RequestPhoto> rPhotos) {
		// 准备返回参数
		ResponsePhotos responsePhotos = new ResponsePhotos();
		
		// 参数验证
		if (null == rPhotos || 0 == rPhotos.size()) {
			responsePhotos.setErrorFlag(true);
			responsePhotos.setErrorCode("PhotoLogic.updatePhoto() failed");
			responsePhotos.setErrorMsg("更新对象不能为空");
			return responsePhotos;
		}
		
		List<File> files = new ArrayList<>();
		
		// 批量更新
		for (RequestPhoto rPhoto: rPhotos) {
			ResponsePhoto responsePhoto = updatePhoto(rPhoto);
			if (responsePhoto.isErrorFlag()) {
				throw new RuntimeException();
			}
			files.add(responsePhoto.getData());
		}
		
		responsePhotos.setFiles(files);
		
		return responsePhotos;
	}
}