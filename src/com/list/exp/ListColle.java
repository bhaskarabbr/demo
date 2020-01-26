package com.list.exp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListColle /* implements Cloneable */ {
	public static void main(String[] args) throws CloneNotSupportedException {
		Map<Integer, Integer> l1 = new HashMap<Integer, Integer>();
		l1.put(10, 10);
		l1.put(20, 20);
		//System.out.println(l1.size());
		Map<Integer, Integer> l2 = l1;
		l2.put(30, 30);
		l2.put(40, 40);
		// System.out.println(l2.size());

		
		  List<String> l3 = new ArrayList<>(); l3.add("bhaskara"); l3.add("mastan");
		  l3.add("prasad"); l3.add("malli"); l3.add("subbu"); l3.add("bhaskara");
		  l3.add("mastan"); l3.add("subbu"); l3.add("bhaskara"); l3.add("mastan");
		  l3.add("prasad"); l3.add("malli"); l3.add("subbu"); l3.add("bhaskara");
		  l3.add("mastan"); l3.add("prasad"); l3.add("malli"); l3.add("subbu");
		 
			
		//String l3[] = {""}; 
		
		
		  Map<String, Long> result = l3.stream()
		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		  List<String> result1 = l3.stream().sorted().collect(Collectors.toList());
		 


		  
		  
		  
		System.out.println(result);
		//System.out.println(result1);

		l2.put(30, 30);
		l2.put(40, 40);
		// System.out.println(l1.size());
		// ListColle l3 = new ListColle();
		// ListColle l4 = (ListColle) l3.clone();
		// System.out.println(l3);
		// System.out.println(l4);
		l2.putAll(l1);
		// System.out.println(l1.size());
	}

}
