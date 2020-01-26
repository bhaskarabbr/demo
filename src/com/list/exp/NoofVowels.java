package com.list.exp;

import java.util.HashMap;
import java.util.Map;

public class NoofVowels {
	public static void main(String[] args) {
		/*
		 * String str = "aeiougheioau"; char[] ch = str.toCharArray(); int couunt = 0;
		 * for (char c : ch) { switch (c) { case 'a': case 'e': case 'i': case 'o': case
		 * 'u': couunt++; break; }
		 * 
		 * } System.out.println(couunt);
		 */


		
		String str = "bhaskaraz";
	    Map<Character, Integer> charMap = new HashMap<>();
	    char[] arr = str.toCharArray();

	    for (char value: arr) {

	      // if (Character.isAlphabetic(value)) {
	           if (charMap.containsKey(value)) {
	               charMap.put(value, charMap.get(value) + 1);

	           } else {
	               charMap.put(value, 1);
	           }
	       }
	   // }

	    System.out.println(charMap.entrySet());
	}
}
