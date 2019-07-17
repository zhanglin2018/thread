package com.advantest.chapter3.notifyAll.src.extthread;

import com.advantest.chapter3.notifyAll.src.service.Service;

public class ThreadA extends Thread {
	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
