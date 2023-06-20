package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.NoteExistsException;

import com.dxc.model.Note;
import com.dxc.model.User;
import com.dxc.service.NoteService;

@RestController
@RequestMapping("/note")
public class NoteController {

	@GetMapping("/greet")
    public String welcome(){
        return "Note Controller page is working";
    }
	
	@Autowired
	NoteService noteservice;
	
	@PostMapping("/createnote")
	public Note createNote(@RequestBody Note note) throws NoteExistsException {
		return this.noteservice.newNote(note);
	}
	
	@PutMapping("/updatenote")
    public Note updatenote(@RequestBody Note note) {
		return this.noteservice.updateNote(note);	
    }
	
	@DeleteMapping("/deletenote/{noteid}")
    public String deleteNote(@PathVariable int noteid){
		noteservice.deleteNoteById(noteid);
		return "note deleted";	
    }
	
	@GetMapping("/getnote/{userid}")
	 public List<Note> getNoteByUser(@PathVariable String userid){
		 return noteservice.getAllNotesByUser(userid);
	 }
}
