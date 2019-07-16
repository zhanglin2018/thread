package com.advantest.chapter2.synTwoLock.src.test;

import com.advantest.chapter2.synTwoLock.src.extthread.ThreadA;
import com.advantest.chapter2.synTwoLock.src.extthread.ThreadB;
import com.advantest.chapter2.synTwoLock.src.extthread.ThreadC;
import com.advantest.chapter2.synTwoLock.src.service.Service;

public class Run {

	public static void main(String[] args) {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();

	}

}
