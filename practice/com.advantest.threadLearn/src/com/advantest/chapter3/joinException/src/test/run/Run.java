package com.advantest.chapter3.joinException.src.test.run;

import com.advantest.chapter3.joinException.src.extthread.ThreadB;
import com.advantest.chapter3.joinException.src.extthread.ThreadC;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();
			b.start();

			Thread.sleep(500);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
