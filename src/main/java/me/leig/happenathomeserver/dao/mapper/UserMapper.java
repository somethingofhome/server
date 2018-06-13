package me.leig.happenathomeserver.dao.mapper;

import java.util.List;

import me.leig.happenathomeserver.dao.model.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKeyWithBLOBs(User record);

	int updateByPrimaryKey(User record);
    
    /**
     * 通过用户信息条件查询用户详情
     * 
     * @param record
     * @return
     */
    List<User> selectList(User record);
}