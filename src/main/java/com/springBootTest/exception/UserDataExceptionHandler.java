package com.springBootTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserDataExceptionHandler {

	@ExceptionHandler(value = {UserDataNotFoundException.class})
	public ResponseEntity<Object> handleUserDataNotFoundException(UserDataNotFoundException userDataNotFoundException){
		UserException userException = new UserException(
				userDataNotFoundException.getMessage(),
				userDataNotFoundException.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(userException, HttpStatus.NOT_FOUND);
	}
}
