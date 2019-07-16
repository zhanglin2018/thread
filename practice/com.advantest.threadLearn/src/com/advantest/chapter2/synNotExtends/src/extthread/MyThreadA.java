package com.advantest.chapter2.synNotExtends.src.extthread;

import com.advantest.chapter2.synNotExtends.src.service.Sub;

public class MyThreadA extends Thread {

	private Sub sub;

	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}

}
