package CostomSorting;

public class Employee {
	String name;
	Double sal;
	public Employee(String name, Double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Salary of "+name+" is "+sal+" LPA";
	}
	
	

}
