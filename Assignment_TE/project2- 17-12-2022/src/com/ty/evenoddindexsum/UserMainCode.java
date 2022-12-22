package com.ty.evenoddindexsum;

public class UserMainCode {


	static int evenIndex =0;
	static int oddIndex =0;
	public static Integer sumOfOddEvenPostion(Integer number) {
		Integer count=0;
		Integer temp= number;
		while (number!=0) {

			count++;
			number=number/10;

		}
		int [] a= new  int[count];
		for (int i = count-1; i >= 0; i--) {
			int temp1 = temp%10;
			a[i]= temp1;
			temp=temp/10;

		}

	
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				evenIndex=evenIndex +a[i];

			}
			else {
				oddIndex=oddIndex+a[i];
			}

		}

		if(evenIndex==oddIndex) {
			return 1;
		}
		else {
			return-1;
		}
	}

}
