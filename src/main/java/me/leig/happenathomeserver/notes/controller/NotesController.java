package me.leig.happenathomeserver.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.leig.happenathomeserver.comm.LogicException;
import me.leig.happenathomeserver.notes.bean.RequestNotes;
import me.leig.happenathomeserver.notes.bean.ResponseNotes;
import me.leig.happenathomeserver.notes.logic.NotesLogic;

/**
 * 笔记控制器
 *
 * @author leig
 * @version 20180301
 *
 */
@RestController
@RequestMapping(value = "v1/notes/")
public class NotesController {

	@Autowired
	private NotesLogic notesLogic;
	
	@RequestMapping(value = "add/", method = {RequestMethod.POST})
	public ResponseNotes addNotes(@RequestBody RequestNotes requestNotes) {
		// 准备返回参数
		ResponseNotes responseNotes = new ResponseNotes();
		
		// 参数验证
		if (null == requestNotes || 0 < requestNotes.getId()) {
			responseNotes.setErrorCode("");
			responseNotes.setErrorMsg("");
			return responseNotes;
		}
		
		try {
			responseNotes = notesLogic.addNotes(requestNotes);
		} catch (LogicException e) {
			e.printStackTrace();
			responseNotes.setErrorCode(e.getErrorCode());
			responseNotes.setErrorMsg(e.getErrorMsg());
		}

		return responseNotes;
	}
	
	@RequestMapping(value = "finds/", method = {RequestMethod.POST})
	public ResponseNotes findNotesList(@RequestBody RequestNotes requestNotes) {
		// 准备返回参数
		ResponseNotes responseNotes = new ResponseNotes();
		
		// 参数验证
		if (null == requestNotes) {
			responseNotes.setErrorCode("findNotesList-E01");
			responseNotes.setErrorMsg("参数不能为空");
			return responseNotes;
		}
		
		try {
			responseNotes = notesLogic.findNotesList(requestNotes);
		} catch (LogicException e) {
			e.printStackTrace();
			responseNotes.setErrorCode(e.getErrorCode());
			responseNotes.setErrorMsg(e.getErrorMsg());
		}
		
		return responseNotes;
	}
	
}
