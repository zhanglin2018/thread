package com.advantest.chapter1.t8.run;

import com.advantest.chapter1.t8.mythread.MyThread1;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 mythread = new MyThread1();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.run();
		System.out.println("end   =" + System.currentTimeMillis());
	}
}
