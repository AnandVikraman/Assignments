package com.te.fibonaccisum;

public class UserMainCode {

	public static Integer getSumOfFibos(Integer number) {
		Integer number1 = 0;
		Integer number2 = 1;
		Integer add = 1;
	for(int i=2;i<=number-1;i++) {
		int sum = number1+number2;
		add =add+sum;
		number1=number2;
		number2=sum;
	}
		return add;
	}

}
