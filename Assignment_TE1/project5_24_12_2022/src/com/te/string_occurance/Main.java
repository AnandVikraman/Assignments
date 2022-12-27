package com.te.string_occurance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string and then a character Symbol to split");
		Integer res = UserMainCode.getSubstring(scanner.nextLine(), scanner.nextLine());
		System.out.println(res);
	}
}
