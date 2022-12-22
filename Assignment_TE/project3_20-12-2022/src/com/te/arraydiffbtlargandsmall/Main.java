package com.te.arraydiffbtlargandsmall;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		Integer size= scanner.nextInt();
		Integer[] a= new Integer [size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
		a[i]=scanner.nextInt();
			
		}
		Integer result =UserMainCode.getBigDiff(a);
		
		System.out.println("Difference b/t largestElement and smallest Elements in an array is "+result);
		
	}

}
