package com.te.remove_3_multiples;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMainCode {

	public static ArrayList<Integer> removeMulitipleOfThree(ArrayList<Integer> arrayListInput) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Iterator<Integer> iterator=arrayListInput.iterator();
		while (iterator.hasNext()) {
			arrayList.add(iterator.next());
			arrayList.add(iterator.next());
			iterator.next();
		}
		return arrayList;
	}

}
