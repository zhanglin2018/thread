package com.advantest.chapter1.t20.test;

import com.advantest.chapter1.t20.extthread.MyThread1;
import com.advantest.chapter1.t20.extthread.MyThread2;

/*
 * 线程的优先级与运行结果的顺序 不是一一对应的
 * 优先级较高的线程不是每一次 都先执行完 run()
 */
public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(5);
			thread1.start();

			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(6);
			thread2.start();
		}
	}
}
