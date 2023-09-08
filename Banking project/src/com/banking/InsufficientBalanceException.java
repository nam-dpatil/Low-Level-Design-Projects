package com.banking;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}

/** docomentation comment
 * rules to develop costom exception
 * ----------------------------------
 * 1. create a class with exception name.
 * 2a.if class extends Exception -> checked exception
 * 2b. if class extends RuntimeException -> Unchecked exception.
 * 3. Override a getMessage.
 * 4.invoke the exception object using throw keyword & handled 
 * it using try and catch block
 * */ 
