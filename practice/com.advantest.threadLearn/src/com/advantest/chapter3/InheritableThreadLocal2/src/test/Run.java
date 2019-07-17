package com.advantest.chapter3.InheritableThreadLocal2.src.test;

import com.advantest.chapter3.InheritableThreadLocal2.src.extthread.ThreadA;
import com.advantest.chapter3.InheritableThreadLocal2.src.tools.Tools;

public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       ��Main�߳���ȡֵ=" + Tools.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
