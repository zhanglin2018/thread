package com.advantest.chapter3.stack_2_new.src.extthread;

import com.advantest.chapter3.stack_2_new.src.service.C;

public class C_Thread extends Thread {

	private C r;

	public C_Thread(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
