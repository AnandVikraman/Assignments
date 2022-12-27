package com.te.array_list_manipulation;

import java.util.ArrayList;

public class UserMainCode {

	public static ArrayList<Integer> generateOddEvenList
	(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
	for (int i = 0; i < arrayList1.size(); i++) {
		if (i%2==0) {
			arrayList3.add(arrayList2.get(i));
		}
		else {
			arrayList3.add(arrayList1.get(i));
		}
	}
		return arrayList3;
	}

}
