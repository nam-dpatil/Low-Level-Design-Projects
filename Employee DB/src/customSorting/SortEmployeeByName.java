package customSorting;
import java.util.Comparator;

import edbms.Employee;
public class SortEmployeeByName implements Comparator<Employee>{
	
		@Override
		public int compare(Employee o1, Employee o2) {
			String x=o1.getName();
			String y=o2.getName();
			return x.compareTo(y);
		
		}

}
