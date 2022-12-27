package com.te.middlecharacters;



public class UserMainCode {

	public static String getMiddleChars(String string) {
		
		Integer startIndex = (string.length()-1)/2;
		Integer lastIndex = startIndex+2;
		
		String result = string.substring(startIndex, lastIndex);
		return result;
		
		
	}

}
