package com.te.palindromeinrange;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1");
		Integer number1 = scanner.nextInt();
		System.out.println("Enter the number2");
		Integer number2 = scanner.nextInt();
		Integer sum = UserMainCode.addPalindromes(number1,number2);
		System.out.println("Sum of palindrome number within given range is "+sum);
	}

}
