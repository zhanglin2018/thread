package com.advantest.chapter2.doubleSynBlockOneTwo.src.test.run;

import com.advantest.chapter2.doubleSynBlockOneTwo.src.extthread.ThreadA;
import com.advantest.chapter2.doubleSynBlockOneTwo.src.extthread.ThreadB;
import com.advantest.chapter2.doubleSynBlockOneTwo.src.service.ObjectService;

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
