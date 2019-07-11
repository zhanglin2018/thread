package com.advantest.chapter1.t18.extthread;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run priority=" + this.getPriority());
	}
}
