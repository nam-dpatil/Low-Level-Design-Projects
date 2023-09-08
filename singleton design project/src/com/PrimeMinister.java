package com;

public class PrimeMinister {
	public static PrimeMinister pm;
	String name = "modiji";
	int age=72;
	
	private PrimeMinister()
	{
		System.out.println("object is created");
	}
	
	public static PrimeMinister getInstance() {
		if(pm==null)
		{
			pm=new PrimeMinister();
		}
		else
		{
			System.out.println("object already created");
		}
		return pm;
	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

	


	
	

}
