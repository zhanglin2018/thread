package com.advantest.chapter2.synchronizedOneThreadIn.src.extthread;

import com.advantest.chapter2.synchronizedOneThreadIn.src.service.ObjectService;

public class ThreadB extends Thread {
	private ObjectService service;

	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
