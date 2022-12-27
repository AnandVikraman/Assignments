package com.te.string_occurance;

public class UserMainCode {
	public static Integer getSubstring(String input, String x) {

		Integer flag = 0;
		while (input.contains(x)) {

			flag++;
			input = input.replaceFirst(x, "-");

		}

		return flag;
	}

}
