package com.springBootTest.exception;


//@SuppressWarnings("serial")
public class UserDataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public UserDataNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserDataNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
