package com.advantest.chapter2.synBlockString2.src.extthread;

import com.advantest.chapter2.synBlockString2.src.service.Service;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.b();

	}

}
