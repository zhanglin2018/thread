package com.advantest.chapter2.synchronizedBlockLockAll.src.test1.extthread;

import com.advantest.chapter2.synchronizedBlockLockAll.src.test1.extobject.MyObject;
import com.advantest.chapter2.synchronizedBlockLockAll.src.test1.service.Service;

public class ThreadA extends Thread {

	private Service service;
	private MyObject object;

	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}

}
