package com.advantest.chapter2.synBlockString2.src.extthread;

import com.advantest.chapter2.synBlockString2.src.service.Service;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.a();

	}

}
