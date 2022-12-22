package com.te.uniquenumber;

public class UserMainCode {

	public static Integer getUnique(Integer number) {
		
		Integer remainder1 =0;
		Integer remainder2=0;
		Integer count=0;
		Integer temp1=number;
		Integer temp2= number;
		while (temp1>0) {
			remainder1=temp1%10;
			while (temp2>0) {
				remainder2=temp2%10;
				if (remainder1==remainder2) {
					count++;
				}
				temp2=temp2/10;
			}
			temp1 = temp1/10;
		}
		if (count==1) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
