package com.advantest.chapter3.p_r_allWait.src.extthread;

import com.advantest.chapter3.p_r_allWait.src.entity.P;

public class ThreadP extends Thread {

	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}

}
