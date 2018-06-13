package me.leig.happenathomeserver.photo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.leig.happenathomeserver.photo.bean.RequestPhoto;
import me.leig.happenathomeserver.photo.bean.ResponsePhoto;
import me.leig.happenathomeserver.photo.bean.ResponsePhotos;
import me.leig.happenathomeserver.photo.logic.PhotoLogic;

/**
 * 照片操作控制器
 *
 * @author leig
 * @version 20180301
 *
 */
@RestController
@RequestMapping(value = "v1/photo/")
public class PhotoController {

	@Autowired
	private PhotoLogic photoLogic;
	
	/**
	 * 添加照片
	 * 
	 * @param requestPhoto
	 * @return
	 */
	@RequestMapping(value = {"add/"}, method = {RequestMethod.POST})
	public ResponsePhoto addPhoto(@RequestBody RequestPhoto requestPhoto) {
		return new ResponsePhoto();
	}
	
	/**
	 * 添加照片集合
	 * 
	 * @param requestPhotos
	 * @return
	 */
	@RequestMapping(value = {"adds/"}, method = {RequestMethod.POST})
	public ResponsePhotos addPhotos(@RequestBody List<RequestPhoto> requestPhotos) {
		return new ResponsePhotos();
	}
	
	/**
	 * 查询照片对象
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = {"find/{id}"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ResponsePhoto findPhoto(@PathVariable int id) {
		System.out.println("得到编号[" + id + "]");
		return new ResponsePhoto();
	}

	/**
	 * 查询照片集合
	 * 
	 * @param requestPhoto
	 * @return
	 */
	@RequestMapping(value = {"finds/"}, method = {RequestMethod.POST})
	public ResponsePhotos findPhotos(@RequestBody RequestPhoto requestPhoto) {
	
		ResponsePhotos rPhotos = photoLogic.findPhotos(requestPhoto);
		
		return rPhotos;
	}
	
	/**
	 * 更新照片对象
	 * 
	 * @param requestPhoto
	 * @return
	 */
	@RequestMapping(value = {"update/"}, method = {RequestMethod.POST})
	public ResponsePhoto updatePhoto(@RequestBody RequestPhoto requestPhoto) {
		return new ResponsePhoto();
	}
	
	/**
	 * 更新照片集合
	 * 
	 * @param responseFiles
	 * @return
	 */
	@RequestMapping(value = {"updates/"}, method = {RequestMethod.POST})
	public ResponsePhotos updatePhotos(@RequestBody ResponsePhotos responsePhotos) {
		return new ResponsePhotos();
	}
	
	/**
	 * 删除照片对象
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = {"del/{id}/"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ResponsePhoto deletePhoto(@RequestParam(value = "id", required = true)int id) {
		return new ResponsePhoto();
	}
	
	/**
	 * 删除照片集合
	 * 
	 * @param responseFiles
	 * @return
	 */
	@RequestMapping(value = {"dels/"}, method = {RequestMethod.POST})
	public ResponsePhotos deletePhotos(@RequestBody ResponsePhotos responsePhotos) {
		
		return new ResponsePhotos();
	}
}
