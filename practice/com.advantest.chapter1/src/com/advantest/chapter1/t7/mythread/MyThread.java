package com.advantest.chapter1.t7.mythread;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
