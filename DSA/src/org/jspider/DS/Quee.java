package org.jspider.DS;

public class Quee {
	int cap, rear, front;
	int Que[];
	public Quee(int cap)
	{
		this.cap=cap;
		Que=new int[this.cap];
	}
	public void enQue(int ele)
	{
		if(rear==cap)
		{
			System.out.println("Que if full");
		}
		else
		{
			Que[rear++]=ele;
		}
	}
	
	public void deQue()
	{
		if(rear==front)
		{
			System.out.println("Que is empty");
		}
		else
		{
			for(int i=0; i<cap-1; i++)
			{
				Que[i]=Que[i+1];
				
			}
			rear--;
		}
	}
	public boolean isEmpty()
	{
		if(rear==front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(rear==cap)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		if(front<rear)
		{
			for(int i=0; i<rear; i++)
			{
				System.out.println(Que[i]);
			}
		}
	}
	

}
