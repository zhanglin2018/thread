package com.advantest.chapter2.synchronizedOneThreadIn.src.test.run;

import com.advantest.chapter2.synchronizedOneThreadIn.src.extthread.ThreadA;
import com.advantest.chapter2.synchronizedOneThreadIn.src.extthread.ThreadB;
import com.advantest.chapter2.synchronizedOneThreadIn.src.service.ObjectService;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
