package CostomSorting;

import java.util.TreeSet;

public class Solutionemp {

	public static void main(String[] args) {
		
		TreeSet<Employee> st=new TreeSet<Employee>(new SortEmployeeByName());
		st.add(new Employee("tom", 200.0));
		st.add(new Employee("guldu", 100.0));
		st.add(new Employee("dinga",50.0));
		
		for(Employee em:st)
		{
			System.out.println(em);
		}

		System.out.println("sort by sal");
		TreeSet<Employee> st1=new TreeSet<Employee>(new SortEmployeeBySal());
		st.add(new Employee("tom", 200.0));
		st.add(new Employee("guldu", 100.0));
		st.add(new Employee("dinga",50.0));
		
		for(Employee em:st)
		{
			System.out.println(em);
		}

	}

}
// x->
