package CostomSorting;
interface Multi1
{
	public static void m1()
	 {
		 System.out.println("concreate method of interface class");
	 }
}
interface Multi2
{
	 public default void m1()
	 {
		 System.out.println("concreate method of interface class");
	 }
}

class A
{
	
}

public class MultipleInheritence extends A implements Multi1,Multi2{
	@Override
	public void m1()
	{
		System.out.println("m1() of Mainclass");
		
	}
	public static void main(String[] args) {
		Multi1 m11 = new MultipleInheritence();
		MultipleInheritence downCast=(MultipleInheritence)m11;
		downCast.m1();
		// we can access m1() to downcasting
		
		Multi2 m22;
		//but just using a reference variable we cannot access the method of implemented calss

	}

}
