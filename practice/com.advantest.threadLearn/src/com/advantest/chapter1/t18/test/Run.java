package com.advantest.chapter1.t18.test;

import com.advantest.chapter1.t18.extthread.MyThread1;

/*
 * 线程的优先级 是具有继承性的，A线程启动B线程，则B线程的优先级与A是一样的。 
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("main thread begin priority="
				+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end   priority="
				+ Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		thread1.setPriority(3);
	}
}
