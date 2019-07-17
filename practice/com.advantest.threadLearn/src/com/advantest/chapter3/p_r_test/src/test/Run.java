package com.advantest.chapter3.p_r_test.src.test;

import com.advantest.chapter3.p_r_test.src.entity.C;
import com.advantest.chapter3.p_r_test.src.entity.P;
import com.advantest.chapter3.p_r_test.src.extthread.ThreadC;
import com.advantest.chapter3.p_r_test.src.extthread.ThreadP;

public class Run {

	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
