package com.te.sumofodddigits;

public class UserMainCode {

	public static Integer checkSum(Integer number) {
		Integer number1;
		Integer sum=0;
		Integer result;
		
		while (number!=0) {
			
			number1=number%10;
			if (number1%2!=0) {
				sum=sum+number1;
			}
			number=number/10;
			
		}
		if (sum%2!=0) {
			return result=1;
			
		}
		else {
			return result=-1;
		}
		
	}

}
