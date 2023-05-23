package com.collection;

public class Binary {
	public static void m1(int a , int b)
	{
		int c=a*b;
		int num=1;
		while(c>0)
		{
			int rem=c%2;
			System.out.println(rem);
			
			num=num*10;
			num=num+rem;
			
			System.out.println(num);
			c=c/2;
			
			
		}
	}

	public static void main(String[] args) {
		m1(3,7);

	}

}
