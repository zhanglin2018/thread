package com.advantest.chapter2.synBlockString.src.test;

import com.advantest.chapter2.synBlockString.src.extthread.ThreadA;
import com.advantest.chapter2.synBlockString.src.extthread.ThreadB;
import com.advantest.chapter2.synBlockString.src.service.Service;

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
