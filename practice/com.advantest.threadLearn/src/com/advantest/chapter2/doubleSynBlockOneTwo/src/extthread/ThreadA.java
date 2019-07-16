package com.advantest.chapter2.doubleSynBlockOneTwo.src.extthread;

import com.advantest.chapter2.doubleSynBlockOneTwo.src.service.ObjectService;

public class ThreadA extends Thread {

	private ObjectService service;

	public ThreadA(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethodA();
	}

}
