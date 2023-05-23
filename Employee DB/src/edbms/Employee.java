package edbms;

public class Employee {
	private String id;
	private static int count=101;
	private int age;
	private String name;
	private double sal;
	public Employee(int age, String name, double sal) {
		super();
		id=count+"JSP";
		count++;
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", sal=" + sal;
	}
	

	

}
