package com.list.exp;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		return -o1.getLocation().compareTo(o2.getLocation());
	}

}
