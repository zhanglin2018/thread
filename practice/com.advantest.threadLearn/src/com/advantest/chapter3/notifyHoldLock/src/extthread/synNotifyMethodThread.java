package com.advantest.chapter3.notifyHoldLock.src.extthread;

import com.advantest.chapter3.notifyHoldLock.src.service.Service;

public class synNotifyMethodThread extends Thread {
	private Object lock;

	public synNotifyMethodThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}

}
