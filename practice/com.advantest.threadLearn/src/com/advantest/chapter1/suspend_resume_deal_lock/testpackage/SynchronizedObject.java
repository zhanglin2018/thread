package com.advantest.chapter1.suspend_resume_deal_lock.testpackage;

public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("The thread a will be suspended for ever.");
			Thread.currentThread().suspend();
		}
		
		System.out.println("end");
	}

}
