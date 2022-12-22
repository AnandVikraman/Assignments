package com.te.emloyee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeDetails employeeDetails = new EmployeeDetails();
		Employee[] employee = null;
		while (true) {
			System.out.println("*****Welcome to Employee Application*****");
			System.out.println("1.Employee Registration\n2.Employee log in\n3.Edit employee details\n4.Exit");
			System.out.println("*****************************************\n");
			System.out.println("please Enter the choice");
			Integer choice = scanner.nextInt();

			switch (choice) {
			case 1:
				employee = employeeDetails.addEmployee();
				if (employee != null) {
					System.out.println("Employee registration sucessfull\n");
					for (Employee employee2 : employee) {
						System.out.print(employee2);
						System.out.println();
					}
				}

//				else {
//					try {
//						throw new EmployeeNotFoundException("Employee data not found ");
//					} catch (EmployeeNotFoundException e) {
//						System.out.println(e.getMessage());
//					}
//
//				}

				break;
			case 2:
				if (employee == null) {
					try {
						throw new EmployeeNotFoundException("Employee data not found\n");
					} catch (EmployeeNotFoundException e) {
						System.out.println(e.getMessage());
						System.out.println("please kindly do employee registration\n");
					}
				} else {
					System.out.println("Enter employee Id");
					Integer employeeid = scanner.nextInt();
					System.out.println("Enter employee password");
					String password = scanner.next();

					boolean result = employeeDetails.employeeLogin(employeeid, password);
					if (result) {
						System.out.println("Log in successfull\n");

					} else {
						try {
							throw new InvalidCredentialsException("Invalid Credentials\n");
						} catch (Exception e) {
							System.out.println(e.getMessage());
							System.out.println("kindly enter valid Credentials\n");
						}
					}
				}
				break;
			case 3:
				if (employee == null) {
					try {
						throw new EmployeeNotFoundException("Employee data not found\n");
					} catch (EmployeeNotFoundException e) {
						System.out.println(e.getMessage());
						System.out.println("please kindly do employee registration\n");
					}
				} else {
					System.out.println("Enter employeeId to edit the employee details");
					Integer id = scanner.nextInt();

					Employee[] employeeUpdated = employeeDetails.editEmployee(id);
					if (employeeUpdated != null) {
						System.out.println("Employee updated\n");
						for (Employee employee2 : employeeUpdated) {
							System.out.println(employee2);
							System.out.println("");
						}
					} else {
						try {
							throw new EmployeeNotFoundException("Employee object not found\n");
						} catch (EmployeeNotFoundException e) {
							System.out.println(e.getMessage());
							System.out.println("kindly enter valid employee data\n");
						}

					}
				}
				break;
			case 4:
				System.out.println("*****Thank you*****");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!!!");
				break;
			}
		}
	}

}
