package com.multi.diamond;

public interface ReadInfo extends DiamnodProblem{
	default public void m1() {
		System.out.println("readInfo");
	}
}
