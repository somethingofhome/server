package me.leig.happenathomeserver.notes.expand;

import me.leig.happenathomeserver.dao.model.NotesExt01;
import me.leig.happenathomeserver.notes.bean.RequestNotes;

/**
 * 数据转换对象
 *
 * @author leig
 * @version 20180301
 *
 */

public class NotesConvert {

	public NotesExt01 beanToModel(RequestNotes requestNotes) {
		NotesExt01 notesExt01 = new NotesExt01();
		if (0 < requestNotes.getId()) {
			notesExt01.setId(requestNotes.getId());
		}
		if (null != requestNotes.getTitle() && "".equals(requestNotes.getTitle())) {
			notesExt01.setTitle("%" + requestNotes.getTitle() + "%");
		}
		if (0 < requestNotes.getGid()) {
			notesExt01.setGid(requestNotes.getGid());
		}
		if (null != requestNotes.getName() && "".equals(requestNotes.getName())) {
			notesExt01.setName("%" + requestNotes.getName() + "%");
		}
		if (null != requestNotes.getContent() && "".equals(requestNotes.getContent())) {
			notesExt01.setContent("%" + requestNotes.getContent() + "%");
		}
		if (null != requestNotes.getRemark() && "".equals(requestNotes.getRemark())) {
			notesExt01.setRemark("%" + requestNotes.getRemark() + "%");
		}
		if (0 < requestNotes.getId()) {
			notesExt01.setId(requestNotes.getId());
		}
		if (null != requestNotes.getStarttime()) {
			notesExt01.setStarttime(requestNotes.getStarttime());
		}
		if (null != requestNotes.getEndtime()) {
			notesExt01.setEndtime(requestNotes.getEndtime());
		}
		return notesExt01;
	}
	
}
