package com.advantest.chapter1.getIdTest.test;

public class Test {
	public static void main(String[] args) {
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId());
	}
}
