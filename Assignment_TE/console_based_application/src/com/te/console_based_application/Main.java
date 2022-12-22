package com.te.console_based_application;

import java.util.Scanner;

public class Main {
	static Integer numberOfEmployes;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee[] employee=null;
		while (true) {
			System.out.println("********Welcome to the application************\n");
			System.out.println("1.Enter number of Employee objects\n2.Enter the employee Details\n3.Check Employee objects are same or not\n4.Display\n5.Exit\n");
			System.out.println("**********************************************");
			System.out.println("please select the Choice"); 
			Integer choice = scanner.nextInt();
			EmployeeDetails employeeDetails = new EmployeeDetails();
			switch (choice) {
			case 1:
				System.out.println("Enter the number of Employees");
				numberOfEmployes = scanner.nextInt();

				break;
			case 2:
				employee =employeeDetails.addemployee(numberOfEmployes);
				if (employee!=null) {
					System.out.println("\nEmployee object is created\n");
					
				}
				else {
					System.out.println("\nEmployee object is not created\n");
				}
				

				break;
			case 3:
				 Employee[] employeesame = employeeDetails.compareEmployeeObject(employee);
				for (Employee employee2 : employeesame) {
					if (employee2==null) {
						continue;
					}
					System.out.println(employee2);
				}

				break;
			case 4:
				employeeDetails.displayEmployeeDetails(employee);
				break;
			case 5:
               System.out.println("Thank you!!!");
               System.exit(0);
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}

		}
	}

}
