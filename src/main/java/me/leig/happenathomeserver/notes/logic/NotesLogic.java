package me.leig.happenathomeserver.notes.logic;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.leig.happenathomeserver.comm.LogicException;
import me.leig.happenathomeserver.dao.mapper.NotesMapper;
import me.leig.happenathomeserver.dao.model.NotesExt01;
import me.leig.happenathomeserver.notes.bean.RequestNotes;
import me.leig.happenathomeserver.notes.bean.ResponseNotes;
import me.leig.happenathomeserver.notes.expand.NotesConvert;

/**
 * 笔记操作业务逻辑
 *
 * @author leig
 * @version 20180301
 *
 */
@Service
public class NotesLogic {

	@Autowired
	private NotesMapper notesMapper;
	
	public ResponseNotes addNotes(RequestNotes requestNotes) throws LogicException {
		
		NotesExt01 notesExt01 = new NotesExt01();
		
		// 初始化参数
		notesExt01.setCreatetime(new Date());
		
		int result = notesMapper.addNotes(notesExt01);
		
		if (0 >= result) {
			throw new LogicException("addNotes-E01", "添加失败", notesExt01.toString());
		}
		
		ResponseNotes responseNotes = new ResponseNotes();
		
		responseNotes.getNotesExt01s().add(notesExt01);
		
		return responseNotes;
	}
	
	public ResponseNotes findNotesList(RequestNotes requestNotes) throws LogicException {
		
		NotesConvert notesConvert = new NotesConvert();
		
		NotesExt01 notesExt01 = notesConvert.beanToModel(requestNotes);
		
		int result = notesMapper.recordsTotal(notesExt01);
		
		if (0 >= result) {
			throw new LogicException("findNotesList-E01", "查询总记录数失败", notesExt01.toString());
		}
		
		List<NotesExt01> notesExt01s = notesMapper.findNotesList(notesExt01);
		
		if (null == notesExt01s || 0 >= notesExt01s.size()) {
			throw new LogicException("findNotesList-E02", "查询记录集合失败", notesExt01.toString());
		}
		
		ResponseNotes responseNotes = new ResponseNotes(result, notesExt01s);
		
		return responseNotes;
	}
	
}
