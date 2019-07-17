package com.advantest.chapter3.notifyOne.src.test;

import com.advantest.chapter3.notifyOne.src.extthread.NotifyThread;
import com.advantest.chapter3.notifyOne.src.extthread.ThreadA;
import com.advantest.chapter3.notifyOne.src.extthread.ThreadB;
import com.advantest.chapter3.notifyOne.src.extthread.ThreadC;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(10000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}

}
