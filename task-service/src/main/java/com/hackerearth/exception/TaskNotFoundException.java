package com.hackerearth.exception;

public class TaskNotFoundException extends Exception {

	String message;

	public TaskNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	

}
