package com.ty.evenoddindexsum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = scanner.nextInt();
		Integer result = UserMainCode.sumOfOddEvenPostion(number);
		System.out.println("Sum of even index position is = "+UserMainCode.evenIndex);
		System.out.println("Sum of odd index position is = "+UserMainCode.oddIndex);
		if (result==1) {
			
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
