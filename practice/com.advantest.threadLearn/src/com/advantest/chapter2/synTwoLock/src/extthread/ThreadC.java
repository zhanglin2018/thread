package com.advantest.chapter2.synTwoLock.src.extthread;
import com.advantest.chapter2.synTwoLock.src.service.Service;


public class ThreadC extends Thread {

	private Service service;

	public ThreadC(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printC();
	}
}
