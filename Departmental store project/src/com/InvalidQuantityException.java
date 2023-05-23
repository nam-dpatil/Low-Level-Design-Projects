package com;

public class InvalidQuantityException extends RuntimeException{
	private String msg;
	public InvalidQuantityException(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
	}
}
