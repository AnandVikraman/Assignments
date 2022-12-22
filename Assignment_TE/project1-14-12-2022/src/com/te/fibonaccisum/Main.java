package com.te.fibonaccisum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number"); 
		Integer number = scanner.nextInt();
		Integer result = UserMainCode.getSumOfFibos(number);
		System.out.println("sum of the first n numbers in the fiboseries is "+result);
	}
 
 }
