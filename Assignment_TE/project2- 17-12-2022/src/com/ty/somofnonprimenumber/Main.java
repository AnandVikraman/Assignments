package com.ty.somofnonprimenumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		Integer number = scanner.nextInt();
		Integer validate = UserMainCode.validateNumber(number);
		Integer result = UserMainCode.addNumber(validate);
		
		System.out.println("Sum of Square of the non prime numbers is "+result);
	}
	
	

}
