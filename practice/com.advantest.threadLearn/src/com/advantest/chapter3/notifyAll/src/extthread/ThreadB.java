package com.advantest.chapter3.notifyAll.src.extthread;

import com.advantest.chapter3.notifyAll.src.service.Service;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
