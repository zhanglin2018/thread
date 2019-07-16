package com.advantest.chapter1.t18.extthread;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1 run priority=" + this.getPriority());
		MyThread2 thread2 = new MyThread2();
		thread2.start();
	}
}
