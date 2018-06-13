package me.leig.happenathomeserver.dao.mapper;

import java.util.List;

import me.leig.happenathomeserver.dao.model.File;

public interface FileMapper {
	
    int deleteByPrimaryKey(Integer id);

	int insert(File record);

	int insertSelective(File record);

	File selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(File record);

	int updateByPrimaryKeyWithBLOBs(File record);

	int updateByPrimaryKey(File record);

    /**
     * 查询总记录数
     * 
     * @param record
     * @return
     */
    int recordCount(File record);
    
    /**
     * 查询文件集合
     * 
     * @param record
     * @return
     */
    List<File> findFiles(File record);
    
    /**
     * 通过编号查询文件
     * 
     * @param id
     * @return
     */
    File findFile(int id);
    
    /**
     * 添加文件
     * 
     * @param record
     * @return
     */
    int addFile(File record);
    
    /**
     * 更新文件
     * 
     * @param record
     * @return
     */
    int updateFile(File record);
}