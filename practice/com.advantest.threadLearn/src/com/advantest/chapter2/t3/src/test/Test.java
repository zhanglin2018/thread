package com.advantest.chapter2.t3.src.test;

import com.advantest.chapter2.t3.src.entity.PublicVar;
import com.advantest.chapter2.t3.src.extthread.ThreadA;

public class Test {

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
