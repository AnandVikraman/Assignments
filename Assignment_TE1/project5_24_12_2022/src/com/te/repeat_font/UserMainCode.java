package com.te.repeat_font;

public class UserMainCode {
	public static String repeatFirstThreeCharacters(String input, Integer repeat) {
		StringBuffer output = new StringBuffer();
		if (input.length() > 2) {
			while (repeat > 0) {
				output.append(input.charAt(0));
				output.append(input.charAt(1));
				output.append(input.charAt(2));
				repeat--;
			}
			return output.toString();

		} else {
			while (repeat > 0) {
				output.append(input);
				repeat--;
			}
			return output.toString();
		}

	}

}
