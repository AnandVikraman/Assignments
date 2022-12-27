package com.te.checkcharacters;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.nextLine();
		
		Integer result = UserMainCode.checkCharacters(input);
		
		if (result==1) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
