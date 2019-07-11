package com.advantest.chapter1.t7.run;

import com.advantest.chapter1.t7.mythread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
		System.out.println("end ==" + mythread.isAlive());
	}
}
