package com.advantest.chapter2.synchronizedUpdateNewValue.src.extthread;

import com.advantest.chapter2.synchronizedUpdateNewValue.src.service.Service;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}
}
