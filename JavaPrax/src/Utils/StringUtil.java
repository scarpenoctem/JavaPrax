package Utils;

import java.util.Arrays;

public class StringUtil {
	
	//accepts a String and returns the String reversed
	public static String reverseString(String str) {
		StringBuilder reversedStr = new StringBuilder();
		for(int x = str.length()-1; x >= 0; x--) {
			reversedStr.append(str.charAt(x));
		}
		return reversedStr.toString();
	}
	
	//accepts two Strings and returns true/false based on if the two Strings are anagrams of each other
	public static boolean isAnagram(String str1, String str2) {
		char[] sortedStr1 = str1.toCharArray();
		char[] sortedStr2 = str2.toCharArray();
		Arrays.sort(sortedStr1);
		Arrays.sort(sortedStr2);
		return Arrays.equals(sortedStr1, sortedStr2);		
	}
}
