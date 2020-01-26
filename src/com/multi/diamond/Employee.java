package com.multi.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee implements Comparable<Object> {
	String name;

	int eid;

	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "-----  " + eid;
	}

	@Override
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e = (Employee) obj;
		int eid2 = e.eid;
		if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return 1;
		else
			return 0;
	}
}

class Tree {
	public static void main(String[] args) {
		
		
		String a[] = {"a,d,g"};
		List l2 =Arrays.asList(a);
		
		
		List<Employee> l = new ArrayList();
		l.add(new Employee("n", 12));
		l.add(new Employee("j", 1200));
		l.add(new Employee("h", 15));
		l.add(new Employee("nk", 1));
		
		System.out.println(l);
		
		
		List<Employee> l1 = new ArrayList((Collection) new MyComparator());
		l1.add(new Employee("n", 12));
		l1.add(new Employee("j", 1200));
		l1.add(new Employee("h", 15));
		l1.add(new Employee("nk", 1));
		System.out.println(l1);
		
	}

}

	class MyComparator implements Comparator{

		public int compare(Object obj1, Object obj2) {
			Employee e1 = (Employee) obj1;   
			Employee e2 = (Employee) obj2;   
			String s1 = e1.name;   
			String s2 = e2.name;   
			return s1.compareTo(s2);
}}
