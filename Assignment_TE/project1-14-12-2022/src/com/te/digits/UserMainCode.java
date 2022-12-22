package com.te.digits;

public class UserMainCode {

	public static Integer countSeven(Integer number) {
		Integer number1=0;
		Integer count =0;
		while (number!=0) {
			number1=number%10;
			if (number1==7) {
				count++;
			}
			number=number/10;
		}
		return count;
	}
}