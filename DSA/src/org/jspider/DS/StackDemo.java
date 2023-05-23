package org.jspider.DS;

public class StackDemo {
	int top=-1, cap;
	int stack[];
	StackDemo(int cap)
	{
		this.cap=cap;
		stack=new int[this.cap];
		
	}
	public void push(int ele)
	{
		if(top==cap-1)
		{
			System.out.println("stack is full");
		}
		else
		{
			stack[++top]=ele;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			top--;
		}
	}
	public void display()
	{
		if(top!=-1)
		{
			for(i=0; i<)
		}
			
	}
}
