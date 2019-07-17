package com.advantest.chapter2.twoNoStop.src.extthread;

import com.advantest.chapter2.twoNoStop.src.service.Service;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}

}
