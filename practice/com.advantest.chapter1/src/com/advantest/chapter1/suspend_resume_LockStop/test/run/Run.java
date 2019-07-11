package com.advantest.chapter1.suspend_resume_LockStop.test.run;

import com.advantest.chapter1.daemonThread.testpackage.MyThread;

public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
