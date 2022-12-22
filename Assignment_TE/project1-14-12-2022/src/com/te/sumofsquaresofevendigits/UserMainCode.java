package com.te.sumofsquaresofevendigits;


public class UserMainCode {

	public static Integer sumOfSquareOfEvenDigits(Integer number) {
		Integer number1=0;
		Integer number2=0;
		while (number!=0) {
			
			number1=number%10;

			if ((number1 % 2)==0) {
				number2+=number1*number1;
				
			}
			number/=10;
		}

		return number2;
	}



}
