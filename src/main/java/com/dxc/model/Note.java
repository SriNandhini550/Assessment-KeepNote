package com.dxc.model;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="NOTES")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private int noteId;
	
	@Column(nullable=false)
	private String noteTitle;
	
	@Column(nullable=false)
	private String noteContent;
	
	@Column(nullable=false)
	private String noteStatus;
	
	@Column(nullable=false)
	private String noteCreatedAt;
	
	@Column(nullable=false)
	private String noteCreatedBy;

	public Note() {
		super();
	}

	public Note(int noteId, String noteTitle, String noteContent, String noteStatus, String noteCreatedAt,
			String noteCreatedBy) {
		super();
		this.noteId = noteId;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.noteCreatedAt = noteCreatedAt;
		this.noteCreatedBy = noteCreatedBy;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public String getNoteStatus() {
		return noteStatus;
	}

	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}

	public String getNoteCreatedAt() {
		return noteCreatedAt;
	}

	public void setNoteCreatedAt(String noteCreatedAt) {
		this.noteCreatedAt = noteCreatedAt;
	}

	public String getNoteCreatedBy() {
		return noteCreatedBy;
	}

	public void setNoteCreatedBy(String noteCreatedBy) {
		this.noteCreatedBy = noteCreatedBy;
	}

	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", noteStatus="
				+ noteStatus + ", noteCreatedAt=" + noteCreatedAt + ", noteCreatedBy=" + noteCreatedBy + "]";
	}



}
