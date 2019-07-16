package com.advantest.chapter1.t8.run;

import com.advantest.chapter1.t8.mythread.MyThread2;

public class Run2 {
	public static void main(String[] args) {
		MyThread2 mythread = new MyThread2();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.start();
		System.out.println("end   =" + System.currentTimeMillis());
	}
}
