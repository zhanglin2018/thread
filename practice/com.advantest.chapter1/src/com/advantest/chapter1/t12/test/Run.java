package com.advantest.chapter1.t12.test;

import com.advantest.chapter1.t12.exthread.MyThread;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(100);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+thread.interrupted());
			System.out.println("�Ƿ�ֹͣ2��="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

