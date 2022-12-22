package com.te.emloyee;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeDetails {
	Scanner scanner = new Scanner(System.in);
	Employee[] employee;

	public Employee[] addEmployee() {
		System.out.println("Enter the count of employee ");
		Integer count = scanner.nextInt();
		employee = new Employee[count];

		System.out.println("Enter the employee details");
		System.out.println("********************************");
		for (int i = 0; i < employee.length; i++) {

			System.out.println("Enter employee Id");
			Integer eid = scanner.nextInt();
			System.out.println("Enter emloyee Password");
			String password = scanner.next();
			System.out.println("Enter employee name");
			String name = scanner.next();
			System.out.println("Enter employee DOB");
			LocalDate dob = LocalDate.parse(scanner.next());
			System.out.println("Enter employee DOJ");
			LocalDate doj = LocalDate.parse(scanner.next());

			employee[i] = new Employee();
			employee[i].setEmployeeId(eid);
			employee[i].setPassword(password);
			employee[i].setEmployeeName(name);
			employee[i].setdOB(dob);
			employee[i].setdOJ(doj);

		}
		return employee;
	}

	public boolean employeeLogin(Integer employeeid, String password) {
		boolean result =false;
		for (int i = 0; i < employee.length; i++) {
			if(employeeid==employee[i].getEmployeeId()&&password.equals(employee[i].getPassword())){
				
				result= true;
				break;
				
			}
			
			else {
				result= false;
			}
		}
		
		return result;
	}

	public Employee[] editEmployee(Integer id) {
		boolean result = false;
		Integer count =0;
		for (int i = 0; i < employee.length; i++) {
			if (id==employee[i].getEmployeeId()) {
				result=true;
				break;
			}
			count++;
		}
		if (result) {
			System.out.println("Enter employee Name");
			String employeeName = scanner.next();
			
			System.out.println("Enter DOB");
			LocalDate dOB =LocalDate.parse(scanner.next());
			employee[count].setEmployeeName(employeeName);
			employee[count].setdOB(dOB);
			
		}
		return employee;
		
		
	}

}
