package com.advantest.chapter3.waitOld.src.extthread;

import com.advantest.chapter3.waitOld.src.entity.Add;

public class ThreadAdd extends Thread {

	private Add p;

	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.add();
	}

}
