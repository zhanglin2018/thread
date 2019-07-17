package com.advantest.chapter3.test2.src.extthread;

public class MyThread2 extends Thread {
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("start to notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("end to notify time=" + System.currentTimeMillis());
		}
	}
}
