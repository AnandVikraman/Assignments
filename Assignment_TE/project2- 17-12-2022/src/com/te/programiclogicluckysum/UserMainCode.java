package com.te.programiclogicluckysum;

public class UserMainCode {

	public static Integer getLuckySum(Integer number1, Integer number2, Integer number3) {
		Integer sum=0;
		if (number1==13) {
			sum=number3;
			return sum;
		}
		else if (number2==13) {
			sum=number1;
			return sum;
		}
		else if (number3==13) {
			sum=number1+number2;
			return sum;
		}
		
		else {
			sum=number1+number2+number3;
			return sum;
		}
		
	}

}
