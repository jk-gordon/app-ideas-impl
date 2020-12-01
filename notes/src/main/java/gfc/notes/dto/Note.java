package gfc.notes.dto;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Id;

@Data
public class Note {

	@Id @Generated
	private Long noteId;

	private String title;

	private String context;

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}