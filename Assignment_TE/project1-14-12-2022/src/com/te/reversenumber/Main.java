package com.te.reversenumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = scanner.nextInt();
		Integer reverse = UserMainCode.reverseNumber(number);
		
		
			System.out.println("Reverse number is "+reverse);
			
		
	}

}