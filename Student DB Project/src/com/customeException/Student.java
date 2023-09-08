package com.customeException;

public class Student {
	private String id;
	private int age;
	private String name;
	private double marks;
	static int count=101;

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public Student(int age, String name, double marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
		id=""+count++;
	}
	
	@Override
	public String toString()
	{
		return "Id "+id+" Age "+age+" Name "+name+" marks "+marks;
	}


	public static void main(String[] args) {
		
		

	}

}
