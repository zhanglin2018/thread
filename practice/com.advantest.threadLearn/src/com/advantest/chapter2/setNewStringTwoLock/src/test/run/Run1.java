package com.advantest.chapter2.setNewStringTwoLock.src.test.run;

import com.advantest.chapter2.setNewStringTwoLock.src.extthread.ThreadA;
import com.advantest.chapter2.setNewStringTwoLock.src.extthread.ThreadB;
import com.advantest.chapter2.setNewStringTwoLock.src.myservice.MyService;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		Thread.sleep(50);// 
		b.start();
	}
}
