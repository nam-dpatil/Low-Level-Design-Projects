package CostomSorting;
class Sum
{
	int sum;
	 public void sum()
	{
		   
	}
}

class Thread10 extends Thread
{
	Sum s1;
	int sum = 0;
	@Override
	 public void run()
	{
		
		synchronized(this)
		{
			for(int i=0; i<10; i++)
			{
				sum=sum+i;
				
			}
		}
		this.notify();
	}
}

public class Custome  {

	public static void main(String[] args) {
		System.out.println("main method execution start");
//		Sum s1=new Sum();
		Thread10 t1=new Thread10();
		t1.start();
		synchronized(t1)
		{
			try {
				t1.wait(4000);
				System.out.println(t1.sum);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("main method execution end");
		
		
		
		
		
	}

}
