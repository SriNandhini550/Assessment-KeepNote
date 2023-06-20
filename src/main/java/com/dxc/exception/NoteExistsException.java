package com.dxc.exception;

public class NoteExistsException extends Exception{
	String msg;

	public NoteExistsException() {
		super();
	}

	public NoteExistsException(String msg) {
		super(msg);
		
	}
}
