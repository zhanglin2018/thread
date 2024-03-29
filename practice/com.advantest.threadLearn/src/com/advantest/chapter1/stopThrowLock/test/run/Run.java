package com.advantest.chapter1.stopThrowLock.test.run;

import com.advantest.chapter1.stopThrowLock.testpackage.MyThread;
import com.advantest.chapter1.stopThrowLock.testpackage.SynchronizedObject;

public class Run {
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(500);
			thread.interrupt();
			System.out.println(object.getUsername() + " "
					+ object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
