package com.list.exp;

public class Strar3 {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i <= 4; i++) { for(int j=0;j<=i;j++) {
		 * 
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */

		
		/*
		 * for (int i = 0; i <= 4; i++) { for (int j = 4; j >= i; j--) {
		 * 
		 * System.out.print("*"); } System.out.println(); }
		 */
		
		
		  int count = 0; for (int i = 0; i <= 4; i++) { for (int j = 0; j <= i; j++) {
		  count = count + 1; System.out.print(count); } System.out.println(); }
		 
		
		  for (int i = 1; i <= 4; i++) { for(int j=1;j<=i;j++) { System.out.print(j); }
		  System.out.println();
		  
		  }
		 
	}
}
