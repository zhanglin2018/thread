package com.advantest.chapter1.t3.test;

import com.advantest.chapter1.t3.mythread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
