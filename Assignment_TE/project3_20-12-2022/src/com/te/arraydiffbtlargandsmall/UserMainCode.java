package com.te.arraydiffbtlargandsmall;

public class UserMainCode {
	public static Integer getBigDiff( Integer[] a) {
		Integer largestElement=a[0];
		Integer smallestElement=a[0];
		if (a.length!=1) {
			for (int i = 1; i < a.length; i++) 
			{
				if (largestElement<a[i]) {
					largestElement=a[i];

				}
				else {
					smallestElement=a[i];
				}
			}

			return   (largestElement-smallestElement);
		}

		else {
			return a[0];
		}

	}

}
