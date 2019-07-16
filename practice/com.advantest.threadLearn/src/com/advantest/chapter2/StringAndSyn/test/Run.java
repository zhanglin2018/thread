package com.advantest.chapter2.StringAndSyn.test;
import com.advantest.chapter2.StringAndSyn.extthread.ThreadA;
import com.advantest.chapter2.StringAndSyn.extthread.ThreadB;
import com.advantest.chapter2.StringAndSyn.service.Service;


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
