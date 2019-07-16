package com.advantest.chapter2.synStaticMethod.src.extthread;

import com.advantest.chapter2.synStaticMethod.src.service.Service;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}
}
