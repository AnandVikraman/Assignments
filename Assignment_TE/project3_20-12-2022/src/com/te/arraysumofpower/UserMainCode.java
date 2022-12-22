package com.te.arraysumofpower;

public class UserMainCode {

	public static Integer getSumOfPower( Integer[] a) {
		Integer sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=(int)(sum+Math.pow(a[i], i));
		}
		return sum;
	}

	
	

}
