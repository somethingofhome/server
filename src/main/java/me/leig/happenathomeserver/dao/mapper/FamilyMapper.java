package me.leig.happenathomeserver.dao.mapper;

import me.leig.happenathomeserver.dao.model.Family;

public interface FamilyMapper {
	
    int deleteByPrimaryKey(Integer id);

	int insert(Family record);

	int insertSelective(Family record);

	Family selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Family record);

	int updateByPrimaryKeyWithBLOBs(Family record);

	int updateByPrimaryKey(Family record);

}