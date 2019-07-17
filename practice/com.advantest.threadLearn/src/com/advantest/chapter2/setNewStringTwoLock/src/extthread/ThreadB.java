package com.advantest.chapter2.setNewStringTwoLock.src.extthread;

import com.advantest.chapter2.setNewStringTwoLock.src.myservice.MyService;

public class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
