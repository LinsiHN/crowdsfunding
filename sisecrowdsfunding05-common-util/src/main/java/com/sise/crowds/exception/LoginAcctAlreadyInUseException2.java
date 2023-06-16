package com.sise.crowds.exception;

public class LoginAcctAlreadyInUseException2 extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public LoginAcctAlreadyInUseException2() {
		super();
	}

	public LoginAcctAlreadyInUseException2(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message,cause,enableSuppression,writableStackTrace);
	}

	public LoginAcctAlreadyInUseException2(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginAcctAlreadyInUseException2(String message) {
		super(message);
	}

	public LoginAcctAlreadyInUseException2(Throwable cause) {
		super(cause);
	}
	
}
