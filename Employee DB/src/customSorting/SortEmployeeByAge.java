

package customSorting;
import java.util.Comparator;

import edbms.Employee;
public class SortEmployeeByAge implements Comparator<Employee>{
	
		@Override
		public int compare(Employee o1, Employee o2) {
			Integer x=o1.getAge();
			Integer y=o2.getAge();
			return x.compareTo(y);
		
		}

}