package com.advantest.chapter3.s5.src.test;

import com.advantest.chapter3.s5.src.extthread.ThreadA;
import com.advantest.chapter3.s5.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
