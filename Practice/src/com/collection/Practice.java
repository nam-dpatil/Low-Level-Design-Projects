package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

class Employee implements Comparable<Employee>
{
	int sal;
	public Employee(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}
	String name;
	
	@Override
	public String toString()
	{
		return "sal "+sal+" name "+name;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return this.sal-(e.sal);
	}
}

public class Practice {
	@Override
	public void finalize()
	{
		System.out.println("Object is removing");
	}

	public static void main(String[] args) {
//		LinkedHashSet<Employee> ls=new LinkedHashSet<>();
//		ls.add(new Employee(10, "ABC"));
//		ls.add(new Employee(100, "XYZ"));
//		ls.add(new Employee(20, "DEF"));
//	
//		System.out.println(ls);
//		
//		for(Employee obj : ls)
//		{
//			System.out.println(obj);
//		}
//		
		Practice p=new Practice();
		p=null;
		System.gc();
		System.out.println("object is removed");
		
		
		
		
		
		
	}
}

