package com.advantest.chapter2.throwExceptionNoLock.src.controller;

import com.advantest.chapter2.throwExceptionNoLock.src.extthread.ThreadA;
import com.advantest.chapter2.throwExceptionNoLock.src.extthread.ThreadB;
import com.advantest.chapter2.throwExceptionNoLock.src.service.Service;

public class Test {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();

			Thread.sleep(500);

			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
