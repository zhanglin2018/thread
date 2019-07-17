package com.advantest.chapter3.notifyHoldLock.src.test;

import com.advantest.chapter3.notifyHoldLock.src.extthread.NotifyThread;
import com.advantest.chapter3.notifyHoldLock.src.extthread.ThreadA;
import com.advantest.chapter3.notifyHoldLock.src.extthread.synNotifyMethodThread;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.start();

	}

}
