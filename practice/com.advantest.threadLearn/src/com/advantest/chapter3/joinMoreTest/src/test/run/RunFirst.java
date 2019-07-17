package com.advantest.chapter3.joinMoreTest.src.test.run;

import com.advantest.chapter3.joinMoreTest.src.extthread.ThreadA;
import com.advantest.chapter3.joinMoreTest.src.extthread.ThreadB;

public class RunFirst {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("   main end=" + System.currentTimeMillis());
	}

}
