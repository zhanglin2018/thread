package com.advantest.chapter1.t1.com.mythread.www;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
