package CostomSorting;

import java.util.Comparator;

public class SortEmployeeBySal implements Comparator<Employee> {
	
	@Override
	public int compare(Employee x, Employee y)
	{
		return x.sal.compareTo(y.sal);
	}
}
