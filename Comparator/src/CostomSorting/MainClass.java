package CostomSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee("Tom", 100.0);
		Employee e2=new Employee("guldu", 700.0);
		Employee e3=new Employee("Dinga", 5000.0);
		Map<Integer, Employee> lhm = new LinkedHashMap<Integer, Employee>();
		lhm.put(100, e1);
		lhm.put(200, e2);
		lhm.put(300, e3);
//		System.out.println(lhm);
		
		Set<Integer> keys=lhm.keySet();
		List<Employee> list=new ArrayList<Employee>();
		
		
		for(Integer key:keys)
		{
			Employee emp = lhm.get(key);
			list.add(emp);
			System.out.println(emp);
		}
		
		System.out.println("---------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1: enter by name\n2: sort by salary");
		System.out.println("enter choice");
		int choice =scan.nextInt();
		
		switch(choice)
		{
		case 1:Collections.sort(list, new SortEmployeeByName());
		for(Employee i: list)
		{
			System.out.println(i);
		}
		break;
		case 2:
			Collections.sort(list, new SortEmployeeBySal());
			for(Employee i: list)
			{
				System.out.println(i);
			}
			break;
			default:
				System.out.println("Invalid Choice");
				
		}
		scan.close();
		
		

	}

}
