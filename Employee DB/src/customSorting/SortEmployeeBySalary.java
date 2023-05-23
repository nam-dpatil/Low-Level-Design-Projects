
package customSorting;
import java.util.Comparator;

import edbms.Employee;
public class SortEmployeeBySalary implements Comparator<Employee>{
	
		@Override
		public int compare(Employee o1, Employee o2) {
			Double x=o1.getSal();
			Double y=o2.getSal();
			return x.compareTo(y);
		
		}

}