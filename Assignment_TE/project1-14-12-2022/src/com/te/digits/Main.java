package com.te.digits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = scanner.nextInt();
		Integer count = UserMainCode.countSeven(number);
		System.out.println("count of the occurance of 7 as digit is "+count);
	}


}
