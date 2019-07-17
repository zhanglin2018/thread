package com.advantest.chapter2.twoNoStop.src.test.run;

import com.advantest.chapter2.twoNoStop.src.extthread.ThreadA;
import com.advantest.chapter2.twoNoStop.src.extthread.ThreadB;
import com.advantest.chapter2.twoNoStop.src.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		ThreadA athread = new ThreadA(service);
		athread.start();

		ThreadB bthread = new ThreadB(service);
		bthread.start();
	}

}
