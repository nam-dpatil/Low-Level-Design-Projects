package customSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String x=o1.getId();
		String y=o2.getId();
		return x.compareTo(y);
	}

}
