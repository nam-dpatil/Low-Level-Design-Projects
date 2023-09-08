package com.customeException;

public class Employee {
	String id;
	String name;
	static int count=101;
	
	Employee(String name)
	{
		this.name=name;
		this.id=""+(count++);
//		count++;
	}

	public static void main(String[] args) {
		Employee e1 =new Employee("tom");
		System.out.println("id : "+e1.id+" Name "+e1.name);
		
		Employee e2 =new Employee("tom");
		System.out.println("id : "+e2.id+" Name "+e2.name);
		
		Employee e3 =new Employee("tom");
		System.out.println("id : "+e3.id+" Name "+e3.name);
		

	}

}
