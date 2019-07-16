package com.advantest.chapter1.suspend_resume_deal_lock.test.run;

import com.advantest.chapter1.suspend_resume_deal_lock.testpackage.SynchronizedObject;

public class Run {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();

			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};

			thread1.setName("a");
			thread1.start();

			Thread.sleep(1000);

			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out.println("The thread2 started");
					System.out.println("start to print content");
					object.printString();
				}
			};
			thread2.start();
			
//			thread1.resume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
