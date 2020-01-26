package com.multi.diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNoOfNames {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("bhaskara");
		list.add("yogesh");
		list.add("vijay");
		list.add("mastan");
		list.add("bhaskara");
		list.add("bhaskara");
		list.add("yogesh");
		list.add("vijay");
		list.add("mastan");
		list.add("bhaskara");
		list.add("bhaskara");
		list.add("yogesh");
		list.add("vijay");
		list.add("mastan");
		list.add("bhaskara");

		System.out.println(list);

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String i : list) {
			Integer j = map.get(i);
			map.put(i, (j == null) ? 1 : j + 1);
		}
		System.out.println(map);

		String str[] = { "bhaskara", "yogesh", "vijay" };
		Map<String, Integer> map1 = new HashMap<>();
		for (String i : str) {
			Integer j = map1.get(i);
			map1.put(i, (j == null) ? 1 : j + 1);
		}
		System.out.println(map1);

		String str2 = "bhaskara";
		Map<String, Integer> map4 = new HashMap<>();
		char[] ch = str2.toCharArray();
		for (char aa : ch) {
			Integer h = map4.get(aa);
			//map4.put(ch, (h == null) ? 1 : h + 1);
		}

	}
}
