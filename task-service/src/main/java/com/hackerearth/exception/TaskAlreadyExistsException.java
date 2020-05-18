package com.hackerearth.exception;

public class TaskAlreadyExistsException extends Exception {

	String message;

	public TaskAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
	
}
