package com.advantest.chapter1.t1.test;

import com.advantest.chapter1.t1.com.mythread.www.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("run end");
	}

}
