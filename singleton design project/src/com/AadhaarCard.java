package com;

public class AadhaarCard {
	String name ="namzy";
	int aadharno=1234;
	private static AadhaarCard ac;
	private AadhaarCard()
	{
		System.out.println("object is created ");
	}
	
	public static AadhaarCard getInstance()
	{
		if(ac==null)
		{
			ac=new AadhaarCard();
		}
		return ac;
	}
	
	@Override
	public String toString()
	{
		return "Name: " +name +" aadharno : "+aadharno;
	}
	
}
