package me.leig.happenathomeserver.user.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.leig.happenathomeserver.comm.BaseLogic;
import me.leig.happenathomeserver.comm.EncryptUtil;
import me.leig.happenathomeserver.comm.LogicException;
import me.leig.happenathomeserver.dao.mapper.UserMapper;
import me.leig.happenathomeserver.dao.model.User;
import me.leig.happenathomeserver.user.bean.ResponseUser;

/**
 * 用户操作业务逻辑
 *
 * @author leig
 * @version 20180301
 *
 */
@Service
public class UserLogic extends BaseLogic {

	@Autowired
	private UserMapper userMapper;
	
	public ResponseUser userLogin(String username, String password) throws LogicException {
		// 参数验证
		if ("".equals(username) || "".equals(password)) {
			throw new LogicException("userLogin-E01", "参数不能为空");
		}
		
		User user = new User();
		try {
			user.setUsername(username);
			user.setPassword(EncryptUtil.getMD5(username + password));
		} catch (Exception e) {
			e.printStackTrace();
			throw new LogicException("userLogin-E02", "密码转换失败", e.getMessage());
		}
		
		List<User> users = userMapper.selectList(user);
		
		if (1 != users.size()) {
			throw new LogicException("userLogin-E02", "用户查询失败");
		}

		ResponseUser responseUser = new ResponseUser(users.get(0));
		
		return responseUser;
		
	}
	
}
