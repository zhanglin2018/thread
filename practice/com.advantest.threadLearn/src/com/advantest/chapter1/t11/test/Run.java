package com.advantest.chapter1.t11.test;

import com.advantest.chapter1.t11.exthread.MyThread;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
