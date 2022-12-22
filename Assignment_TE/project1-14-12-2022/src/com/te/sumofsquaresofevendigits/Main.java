package com.te.sumofsquaresofevendigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = scanner.nextInt();
		Integer result = UserMainCode.sumOfSquareOfEvenDigits(number);
		
		System.out.println("Sum Of Square Of Even Digits is "+number+" = "+result);
				
		
	}


}
