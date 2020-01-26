package com.multi.diamond;

public class ReadWrite implements WriteInfo, ReadInfo {
	public static void main(String[] args) {
		new ReadWrite().m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		ReadInfo.super.m1();
	}

}
