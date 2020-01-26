package com.multi.diamond;

import java.util.HashMap;
import java.util.Map;

public class HashMapVSCocurrentHashMap extends Thread {
	static HashMap<Integer, String> map = new HashMap<>();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("entered into main ");
		map.put(2, "Prasad");
		map.put(3, "Praveen");
		System.out.println("thred started");
		HashMapVSCocurrentHashMap h = new HashMapVSCocurrentHashMap();
		h.start();
		for (Object m : map.entrySet()) {
			Object s = m;
			System.out.println(s);
			Thread.sleep(1000);
			System.out.println();
		}
		System.out.println(map);
	}

	@Override
	public void run() {

		try {
			System.out.println("thread entered into run() ");
			Thread.sleep(1000);
			System.out.println("sleepig completed");
			map.put(1, "Bhaskara");
			System.out.println("run completed");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
