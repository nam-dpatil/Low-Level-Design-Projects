package com.banking;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to the union bank");
		System.out.println("------------");
		
		Bank b1=new Bankingimpl(10000);
		
		while(true)
		{
			System.out.println("-----------");
			System.out.println("-----------");
			System.out.println("1 : deposit the amount");
			System.out.println("2 : withdraw the amount");
			System.out.println("3 : avalable amount");
			System.out.println("4 : exit the program");
			System.out.println("-----------");
			System.out.println("enter choice:");
			int choice=sc.nextInt();
			
			
			
			
			switch(choice)
			{
			case 1 : System.out.println("enter the amt to be deposite");
				b1.deposit(sc.nextInt()); 
			break;
			case 2 : System.out.println("enter the amt to be withdraw");
				b1.withdraw(sc.nextInt()); 
			break;
			case 3 : System.out.println(b1.avlBalance());;
			break;
			case 4 : System.exit(0);
			break;
			default : System.out.println("invalid choice");
			}
		}

	}

}
