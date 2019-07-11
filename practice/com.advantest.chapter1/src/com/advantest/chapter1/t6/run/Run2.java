package com.advantest.chapter1.t6.run;

import com.advantest.chapter1.t6.mythread.MyThread;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		// mythread.start();
		mythread.run();
	}
}
