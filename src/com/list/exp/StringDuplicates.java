package com.list.exp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicates {

	public static void main(String[] args) {

		String str1 = new String("javabjhgjh");
		String str2 = new String();

		/*
		 * String[] arr = str1.split(""); for(int i=0;i<arr.length;i++) { if(i != 0) {
		 * String[] temp = str2.split(""); boolean flag = true; for(String s : temp) {
		 * if(s.equals(arr[i])) { flag = false; break; } } if(flag) str2 += arr[i];
		 * }else { str2 += arr[i]; } } System.out.println(str2);
		 */

		/*
		 * char[] chars = str1.toCharArray(); int index = 0;
		 * 
		 * for(int i=0;i<chars.length;i++) { int j; for(j=0;j<i;j++) {
		 * 
		 * if(chars[i] == chars[j]) { break; } }
		 * 
		 * if(i == j) { chars[index++] = chars[i]; }
		 * 
		 * }
		 * 
		 * System.out.println(String.valueOf(chars,0,index));
		 */

		String str3 = "bhaskara";
		int index1 = 0;
		char[] char1 = str3.toCharArray();
		for (int i = 0; i < str3.length(); i++) {
			int j = 0;
			for (j = 0; j < i; j++) {
				if (char1[i] == char1[j]) {
					break;
				}

			}
			if (i == j) {
				char1[index1++] = char1[i];
			}
		}
		System.out.println(String.valueOf(char1, 0, index1));
	

	String input = new String("javalanguage");
	//String output = new String();
	//String input = "assddffa";
	//String output = new String();
	input=Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());
	//System.out.println(input);

}
}

