package com.advantest.chapter1.t15.test;

import com.advantest.chapter1.t15.exthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		thread.interrupt();
		System.out.println("main end!");
	}
}
