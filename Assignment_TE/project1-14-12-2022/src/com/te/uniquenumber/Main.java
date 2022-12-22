
package com.te.uniquenumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = scanner.nextInt();
		Integer result = UserMainCode.getUnique(number);
		if (result==1) {
			System.out.println(number+" is Unique");
		}
		else {
			System.out.println(number+" is not Unique");
		}
	}

}
