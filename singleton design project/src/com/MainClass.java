package com;

public class MainClass {

	public static void main(String[] args) {
		//internally --> AadhaarCard ac=new AadhaarCard();
		
		AadhaarCard ac=AadhaarCard.getInstance();
		
		//when toString method is Overridden
		System.out.println(ac);
		
		//when toString method is not Overridden
		System.out.println(ac.name);
		System.out.println(ac.aadharno);
		

	}

}
