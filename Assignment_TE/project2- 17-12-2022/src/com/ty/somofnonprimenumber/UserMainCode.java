package com.ty.somofnonprimenumber;

public class UserMainCode {
	static Integer sum =1;
	public static Integer validateNumber(Integer number) {
		Integer count=0;
		for (int i = 2; i <=number; i++) {

			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count!=2) {
				sum=sum+i;
			}
			count=0;
		}
		return sum;
	}
	public static Integer addNumber(Integer validate) {

		return sum;
	}



}
