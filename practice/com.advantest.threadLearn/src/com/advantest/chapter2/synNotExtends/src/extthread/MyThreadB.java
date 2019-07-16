package com.advantest.chapter2.synNotExtends.src.extthread;

import com.advantest.chapter2.synNotExtends.src.service.Sub;

public class MyThreadB extends Thread {

	private Sub sub;

	public MyThreadB(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}
}
