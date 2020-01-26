package com.list.exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeList {
	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		/*
		 * l.add(new Employee("Bhaskara", "chennai")); l.add(new Employee("masthan",
		 * "bangalore")); l.add(new Employee("subbu", "bangalore")); l.add(new
		 * Employee("malli", "tirupati")); l.add(new Employee("vijay", "noida"));
		 */
		l.add(new Employee("yogesh", "delhi"));

		// l.set(0, new Employee("Ganesh", "RMP"));
		l.add(new Employee("venkey", "mpl"));

		/*
		 * ArrayList<Employee> l1 = new ArrayList<>(); l.add(new Employee("venkey",
		 * "mpl"));
		 * 
		 * l1.retainAll(l); // l.add(new Employee("masthan", "bangalore"));
		 * System.out.println(l); System.out.println(l1);
		 */

		// l.sort(Comparator.comparing(Employee::getEmpName));
		// System.out.println(l);

		// l.sort(Comparator.comparing(Employee::getLocation).reversed());
		// System.out.println(l);

		// l.sort(Comparator.comparing(Employee::getLocation));
		// System.out.println(l);

		// l.sort(Comparator.comparing(e -> e.getLocation()));
		// System.out.println(l);

		// l.sort(Comparator.comparing(e -> e.getEmpName()));
		// for (Employee employee : l) {
		// System.out.println(employee);

		// }
		// System.out.println(l);

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(70);
		l1.add(20);
		l1.add(80);
		l1.add(50);
		l1.add(40);
		l1.add(40);

		//System.out.println(l1);

		// List<Integer> l5 = l1.stream().sorted((l2, l3) ->
		// l2.compareTo(l3)).collect(Collectors.toList());
		// System.out.println(l5);
		 List<Integer> l2 = l1.stream().distinct().collect(Collectors.toList());
		l2.sort(Comparator.comparing(r -> r));
		System.out.println(l2);

		// l.stream().sorted((s1, s2) ->
		// -s1.compareTo(s2)).collect(Collectors.toList());
		// Collections.sort(l, new MyComparator());
		// System.out.println(l);

		/*
		 * l.sort(Comparator.comparing(e->e.getLocation())); System.out.println(l);
		 */

		/*
		 * l.sort(Comparator.comparing(Employee::getLocation).reversed());
		 * System.out.println(l);
		 */
	}

}
