package com.list.exp;

import java.util.Collections;
import java.util.Vector;

public class AgeObject {
	//public static void main(String[] args) {
		/*
		 * List<Employee> l = new ArrayList<>(); l.add(new Employee("bhaskara", "hyd"));
		 * l.add(new Employee("yogesh", "dl")); l.add(new Employee("vijay", "kk"));
		 * l.add(new Employee("mastan", "bng")); l.add(new Employee("raj", "pn"));
		 * l.add(new Employee("raju", "chennai")); l.add(new Employee("siva",
		 * "chennai")); l.add(new Employee("prasad", "chennai")); l.add(new
		 * Employee("chan", "chennai")); System.out.println(l);
		 */
		//String str[]=l.
		//for(int i = 0;i) {
			
		//}
		//if() {
			
		//}
		
		
		
		static void sortArray(int a[], int n) 
		{ 

			Vector<Integer> ans = new Vector<>(); 
			for (int i = 0; i < n; i++) 
			{ 
				if (a[i] >= 0) 
					ans.add(a[i]); 
			} 

			Collections.sort(ans); 

			int j = 0; 
			for (int i = 0; i < n; i++) 
			{ 
				if (a[i] >= 0) 
				{ 
					a[i] = ans.get(j); 
					j++; 
				} 
			} 

			for (int i = 0; i < n; i++) 
				System.out.print(a[i] + " "); 
		} 

		public static void main(String[] args) 
		{ 
			int arr[] = { 2, -6, -3, 8, 4, 1 }; 

			int n = arr.length; 

			sortArray(arr, n); 
		
		


		
		
		
		
	}
}
