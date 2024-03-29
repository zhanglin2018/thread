package com.advantest.chapter3.notifyOne.src.extthread;

import com.advantest.chapter3.notifyOne.src.service.Service;

public class ThreadC extends Thread {
	private Object lock;

	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
