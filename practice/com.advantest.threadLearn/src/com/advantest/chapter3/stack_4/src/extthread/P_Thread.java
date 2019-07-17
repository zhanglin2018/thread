package com.advantest.chapter3.stack_4.src.extthread;

import com.advantest.chapter3.stack_4.src.service.P;

public class P_Thread extends Thread {

	private P p;

	public P_Thread(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.pushService();
		}
	}

}
