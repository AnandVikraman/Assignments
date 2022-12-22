package com.te.palindromeinrange;

public class UserMainCode {

	public static Integer addPalindromes(Integer number1, Integer number2) {
		Integer sum=0;
		for (int i = number1; i <= number2; i++) {
			Integer remainder=0;
			Integer number3 = i;
			while (number3!=0) {
				remainder=(remainder*10)+(number3%10);
				number3/=10;
			}
		if (remainder==i) {
			sum+=i;
		}
		}
		return sum;
	}

}
