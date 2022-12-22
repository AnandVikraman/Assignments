package com.te.reversenumber;

public class UserMainCode {

	public static Integer reverseNumber(Integer number) {
		//Integer number1=number;
		Integer reverse =0;
		Integer remainder=0;
		while (number!=0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		
		return reverse;
	}

}
