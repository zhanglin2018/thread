package com.advantest.chapter1.t12.test;

import com.advantest.chapter1.t12.exthread.MyThread;

public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("stop1 "+thread.isInterrupted());
			System.out.println("stop2 "+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

