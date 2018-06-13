package me.leig.happenathomeserver.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.leig.happenathomeserver.comm.BaseController;
import me.leig.happenathomeserver.comm.LogicException;
import me.leig.happenathomeserver.user.bean.ResponseUser;
import me.leig.happenathomeserver.user.logic.UserLogic;

/**
 * 用户登录
 *
 * @author leig
 * @version 20180301
 *
 */
@RestController
@RequestMapping(value = "v1/user/")
public class UserController extends BaseController {
	
	@Autowired
	private UserLogic userLogic;
	
	@RequestMapping(value = {"login/{username}/{password}"}, method = {RequestMethod.GET})
	public ResponseUser logic(@PathVariable String username, @PathVariable String password) {
		// 准备返回参数
		ResponseUser responseUser = new ResponseUser();
		
		System.out.println("username: " + username + " password: " + password);
		
		username = username.trim();
		
		password = password.trim();
		
		// 参数验证
		if ("".equals(username) || "".equals(password)) {
			responseUser.setErrorCode("logic-E01");
			responseUser.setErrorMsg("参数不能为空");
			return responseUser;
		}
		
		try {
			responseUser = userLogic.userLogin(username, password);
		} catch (LogicException e) {
			e.printStackTrace();
			responseUser.setErrorCode(e.getErrorCode());
			responseUser.setErrorMsg(e.getErrorMsg());
		}
		
		return responseUser;
	}
	
}
