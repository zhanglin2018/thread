package com.advantest.chapter2.synchronizedBlockLockAll.src.test2.extthread;

import com.advantest.chapter2.synchronizedBlockLockAll.src.test2.extobject.MyObject;

public class ThreadB extends Thread {
	private MyObject object;

	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
