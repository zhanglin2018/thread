package com.advantest.chapter2.t2.src.extthread;

import com.advantest.chapter2.t2.src.service.HasSelfPrivateNum;

public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
