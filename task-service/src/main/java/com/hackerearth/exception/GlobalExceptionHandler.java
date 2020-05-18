package com.hackerearth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value= TaskAlreadyExistsException.class)
    public ResponseEntity<String> whenTrackAlreadyExistsException(TaskAlreadyExistsException exception)
    {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value= TaskNotFoundException.class)
    public ResponseEntity<String> whenTrackNotFoundException(TaskNotFoundException exception)
    {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
