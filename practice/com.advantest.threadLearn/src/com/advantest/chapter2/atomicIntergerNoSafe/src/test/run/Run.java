package com.advantest.chapter2.atomicIntergerNoSafe.src.test.run;

import com.advantest.chapter2.atomicIntergerNoSafe.src.extthread.MyThread;
import com.advantest.chapter2.atomicIntergerNoSafe.src.service.MyService;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();

			MyThread[] array = new MyThread[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
