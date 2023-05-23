package edbms;

import java.util.Scanner;

import costomeException.InvalidChoiceException;



public class Solution {

	public static void main(String[] args) {
		System.out.println("welcome to employee DataBase project");
		System.out.println("=====================================");

		Scanner sc=new Scanner(System.in);
		EmployeeManagementSystem em=new EmployeeManagementSystemImpl();

		while(true)
		{
			System.out.println("1: Add Employee\n2:Display Employee");
			System.out.println("3: Display All Employees\n4:Remove Employee");
			System.out.println("5: Remove All Employees\n6:Update Employee");
			System.out.println("7: Display All Employees\n8:Remove Employee");

			System.out.println("enter the option");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: em.addEmployee();
			break;

			case 2: em.displayEmployee();
			break;

			case 3: em.displayAllEmployee();
			break;

			case 4: em.removeEmployee();
			break;

			case 5: em.removeAllEmployees();
			break;

			case 6: em.updateEmployee();
			break;

			case 7: em.countEmployees();
			break;

			case 8: em.getEmployeeWithHeighestSalary();
			break;

			case 9: em.getEmployeeWithlowestSalary();
			break;

			default: 
				try
				{
					throw new InvalidChoiceException("invalid choice");
				}
				catch(InvalidChoiceException obj)
				{
					obj.printStackTrace();
				}


			}
		}



	}

}
