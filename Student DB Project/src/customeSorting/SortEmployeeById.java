package customeSorting;

import java.util.Comparator;

import edbms.Employee;



public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String x=e1.getId();
		
		return 0;
	}
	
	

}
