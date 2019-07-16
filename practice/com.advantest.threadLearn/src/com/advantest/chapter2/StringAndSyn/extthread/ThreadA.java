package com.advantest.chapter2.StringAndSyn.extthread;

import com.advantest.chapter2.StringAndSyn.service.Service;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print("AA");
	}
}
