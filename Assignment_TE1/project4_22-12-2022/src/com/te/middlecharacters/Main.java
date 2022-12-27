package com.te.middlecharacters;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String string = scanner.next();
		if (string.length()%2==0) {
			String result = UserMainCode.getMiddleChars(string);
			System.out.println("Midddle characters = "+result);
		}
		else {
			System.out.println("kindly enter even length word (e.g)king");
			
		}
	}

}
