package com.list.exp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class Larraylist {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(40);
		l.add(40);
		l.add(40);
		System.out.println(l);
		Set<Integer> set = new HashSet<>(l);
		// System.out.println(set);
		// System.out.println(l);

		/* List<String> deDupStringList3 = */ l.stream().distinct().collect(Collectors.toCollection(HashSet::new))
				.forEach(System.out::println);
		;
		
		// l.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		// l.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

		// List<Integer> newList = l.stream().distinct().collect(Collectors.toList());
		// System.out.println(newList);
	}
}
