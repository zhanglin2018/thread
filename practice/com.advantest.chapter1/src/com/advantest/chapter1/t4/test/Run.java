package com.advantest.chapter1.t4.test;

import com.advantest.chapter1.t14.exthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();

		Thread a=new Thread(mythread,"A");
		Thread b=new Thread(mythread,"B");
		Thread c=new Thread(mythread,"C");
		Thread d=new Thread(mythread,"D");
		Thread e=new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
