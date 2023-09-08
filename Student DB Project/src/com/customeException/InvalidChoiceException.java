package com.customeException;

public class InvalidChoiceException extends Exception {
	private String msg;
	public InvalidChoiceException(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
	}

}
