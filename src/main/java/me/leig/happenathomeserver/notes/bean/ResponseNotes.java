package me.leig.happenathomeserver.notes.bean;

import java.util.ArrayList;
import java.util.List;

import me.leig.happenathomeserver.comm.BaseResponse;
import me.leig.happenathomeserver.comm.Constant;
import me.leig.happenathomeserver.comm.Toolbox;
import me.leig.happenathomeserver.dao.model.NotesExt01;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public class ResponseNotes extends BaseResponse {

	private int recordsTotal = 0;
	
	private int pageTotal = 0;
	
	private List<NotesExt01> notesExt01s = new ArrayList<>();
	
	public ResponseNotes() {
		
	}
	
	public ResponseNotes(int recordsTotal, List<NotesExt01> notesExt01s) {
		this(recordsTotal, Constant.limit, notesExt01s);
	}
	
	public ResponseNotes(int recordsTotal, int limit, List<NotesExt01> notesExt01s) {
		this.recordsTotal = recordsTotal;
		this.pageTotal = Toolbox.pageForTotal(recordsTotal, limit);
		this.notesExt01s = notesExt01s;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public List<NotesExt01> getNotesExt01s() {
		return notesExt01s;
	}

	public void setNotesExt01s(List<NotesExt01> notesExt01s) {
		this.notesExt01s = notesExt01s;
	}
	
}
