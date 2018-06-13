package me.leig.happenathomeserver.dao.mapper;

import java.util.List;

import me.leig.happenathomeserver.dao.model.Notes;
import me.leig.happenathomeserver.dao.model.NotesExt01;

public interface NotesMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Notes record);

    int insertSelective(Notes record);

    Notes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notes record);

    int updateByPrimaryKeyWithBLOBs(Notes record);

    int updateByPrimaryKey(Notes record);
    
    
    /**
     * 添加笔记
     * 
     * @param record
     * @return
     */
    int addNotes(NotesExt01 record);
    
    /**
     * 获取笔记总数
     * 
     * @param record
     * @return
     */
    int recordsTotal(NotesExt01 record);
    
    /**
     * 获取笔记集合
     * 
     * @param record
     * @return
     */
    List<NotesExt01> findNotesList(NotesExt01 record);
}