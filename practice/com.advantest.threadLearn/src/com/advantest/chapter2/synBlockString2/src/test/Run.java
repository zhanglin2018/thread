package com.advantest.chapter2.synBlockString2.src.test;

import com.advantest.chapter2.synBlockString2.src.extthread.ThreadA;
import com.advantest.chapter2.synBlockString2.src.extthread.ThreadB;
import com.advantest.chapter2.synBlockString2.src.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
