package com.te.array_list_sorting_merging;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {

	public static ArrayList<Integer> sortMergedArrayList
	(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
		arrayList1.addAll(arrayList2);
		Collections.sort(arrayList1);
		ArrayList<Integer> arrayList3= new ArrayList<Integer>();
		arrayList3.add(arrayList1.get(2));
		arrayList3.add(arrayList1.get(6));
		arrayList3.add(arrayList1.get(8));
		return arrayList3;
	}

}
