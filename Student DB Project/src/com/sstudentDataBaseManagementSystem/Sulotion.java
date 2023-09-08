package com.sstudentDataBaseManagementSystem;

import java.util.Scanner;

import com.customeException.InvalidChoiceException;

public class Sulotion {

	public static void main(String[] args) {
		System.out.println("welcome to the Student DB");
		System.out.println("---------------");
		Scanner sc=new Scanner(System.in);
		StudentManagementSystem sms=new StudentManagementSystemImpl();
		while(true)
		{
			System.out.println("1:addStudent\n 2: displayStudent\n 3: displayAllStudent\n4:removeStudents\n"
					+ "5:removeAllStudents\n 6:updateStudent\n 7:countStudent\n 8:getStudentWithHighGetMarks\n"
					+ "9:getStudentWithLowerGetMarks");
			System.out.println("enter the option");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: sms.addStudent();
			break;
			
			case 2: sms.displayStudent();
			break;
			
			case 3: sms.displayAllStudent();
			break;
			
			case 4: sms.removeStudents();
			break;
			
			case 5: sms.removeAllStudents();
			break;
			
			case 6: sms.updateStudent();
			break;
			
			case 7: sms.countStudent();
			break;
			
			case 8: sms.getStudentWithHighGetMarks();
			break;
			
			case 9: sms.getStudentWithLowerGetMarks();
			break;
			
			default: 
				try
				{
					throw new InvalidChoiceException("invalid choice");
				}
				catch(Exception obj)
				{
					obj.printStackTrace();
				}
			
			
			}
			
			System.out.println("-----------------------------------");
		}

	}

}


