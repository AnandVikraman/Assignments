package com.te.console_based_application;

import java.util.Scanner;

public class EmployeeDetails {
	Scanner scanner=new Scanner(System.in);
	Employee[] employee;
	public Employee[] addemployee(Integer numberOfEmployes) {
		employee = new Employee[numberOfEmployes];



		for (int i = 0; i < employee.length; i++) {
			System.out.println("Enter the employee id");
			Integer eid = scanner.nextInt();
			System.out.println("Enter the employee name");
			String ename = scanner.next();
			System.out.println("Enter the employee age");
			Integer age = scanner.nextInt();
			System.out.println("Enter the employee location ");
			String location = scanner.next();
			employee[i]=new Employee();
			employee[i].setEmployeeId(eid);
			employee[i].setEmployeeName(ename);
			employee[i].setAge(age);
			employee[i].setLocation(location);
		}
		return employee;


	}
	public void displayEmployeeDetails(Employee[] employee) {
		for (Employee employee2 : employee) {
			System.out.println(employee2);

		}		
	}
	public Employee[] compareEmployeeObject(Employee[] employee2) {
		Employee[] employees = new Employee[employee2.length];
		for (int i = 0; i < employee2.length; i++) {
			for (int j = i+1; j < employee2.length; j++) {
				if (employee2[i].equals(employee2[j])) {
					//System.out.println("Object is same "+employee2[i]+"\n "+employee2[j]);
					employees[i]=employee2[j];
					employees[i+1]=employee2[i];
				}

			}

		}
		return employees;
		


	}

}
