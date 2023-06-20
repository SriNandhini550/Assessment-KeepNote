package com.dxc.exception;

public class UserAlreadyExistException extends Exception {
	String msg;

	public UserAlreadyExistException() {
		super();
	}

	public UserAlreadyExistException(String msg) {
		super(msg);
		
	}
}
