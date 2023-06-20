package com.dxc.service;

import java.util.List;

import com.dxc.exception.NoteExistsException;
import com.dxc.model.Note;

public interface NoteService {

	Note newNote(Note note) throws NoteExistsException;

	Note updateNote(Note note);

	void deleteNoteById(int noteid);

	List<Note> getAllNotesByUser(String userid);

}
