package com.advantest.chapter2.atomicIntergerNoSafe.src.service;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

	public static AtomicLong aiRef = new AtomicLong();

	synchronized public void addNum()  {
		System.out.println(Thread.currentThread().getName() + "add 100֮:"
				+ aiRef.addAndGet(100));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aiRef.addAndGet(1);
	}

}
