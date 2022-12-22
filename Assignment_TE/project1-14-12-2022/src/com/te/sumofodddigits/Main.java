package com.te.sumofodddigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		Integer number = scanner.nextInt();
		Integer result = UserMainCode.checkSum(number);
		if (result==1) {
			System.out.println("The Sum of odd digits is odd");
			
		}
		else {
			System.out.println("The Sum of odd digits is even");
			
		}
	}
	

}

