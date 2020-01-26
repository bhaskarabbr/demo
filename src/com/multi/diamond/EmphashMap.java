package com.multi.diamond;

import java.util.HashMap;
import java.util.Map;

public class EmphashMap {
	public static void main(String[] args) {

		Map<Employeee, Integer> map = new HashMap();
		map.put(new Employeee("nani", 1), 100);
		map.put(new Employeee("nani", 1), 100);
		System.out.println(map);

	}
}
