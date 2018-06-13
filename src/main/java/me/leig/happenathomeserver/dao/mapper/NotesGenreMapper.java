package me.leig.happenathomeserver.dao.mapper;

import me.leig.happenathomeserver.dao.model.NotesGenre;

public interface NotesGenreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NotesGenre record);

    int insertSelective(NotesGenre record);

    NotesGenre selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NotesGenre record);

    int updateByPrimaryKeyWithBLOBs(NotesGenre record);

    int updateByPrimaryKey(NotesGenre record);
}