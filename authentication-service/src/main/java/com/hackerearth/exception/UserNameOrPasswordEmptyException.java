package com.hackerearth.exception;

public class UserNameOrPasswordEmptyException extends Exception {

    private String message;
    public UserNameOrPasswordEmptyException(String message){

        super(message);
        this.message=message;
    }
}
