package com.multi.diamond;

public interface WriteInfo extends DiamnodProblem {
	default public void m1() {
		System.out.println("writeInfo");
	}
}
