package gfc.notes.dao;

import gfc.notes.dto.Note;

import java.util.List;

public interface NotesDao {

	 Note createNote(Note note);

	 Note getNoteByTitle(String title);

	 Note getNoteById(Long id);

	 List<Note> getAllNotes();

	 Note updateNote(Note note);

	 void removeNote(Note note);
}
