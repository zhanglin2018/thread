package com.advantest.chapter3.p_r_allWait.src.extthread;

import com.advantest.chapter3.p_r_allWait.src.entity.C;

public class ThreadC extends Thread {

	private C r;

	public ThreadC(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.getValue();
		}
	}

}
