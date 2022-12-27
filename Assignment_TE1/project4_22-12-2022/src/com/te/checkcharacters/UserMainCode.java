package com.te.checkcharacters;

public class UserMainCode {

	public static Integer checkCharacters(String input) {
		if (input.charAt(0) == input.charAt(input.length()-1)) {
			return 1;
		} else {
			return -1;
		}

	}

}
