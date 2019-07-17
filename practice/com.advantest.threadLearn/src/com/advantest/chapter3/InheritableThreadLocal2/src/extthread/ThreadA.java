package com.advantest.chapter3.InheritableThreadLocal2.src.extthread;

import com.advantest.chapter3.InheritableThreadLocal2.src.tools.Tools;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("��ThreadA�߳���ȡֵ=" + Tools.tl.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
