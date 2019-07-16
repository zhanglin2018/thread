package com.advantest.chapter2.synStaticMethod.src.test;

import com.advantest.chapter2.synStaticMethod.src.extthread.ThreadA;
import com.advantest.chapter2.synStaticMethod.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();

	}

}
