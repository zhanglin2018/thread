package test;

import extthread.MyThread1;


/*
 * �̵߳����ȼ� �Ǿ��м̳��Եģ�A�߳�����B�̣߳���B�̵߳����ȼ���A��һ���ġ� 
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("main thread begin priority="
				+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end   priority="
				+ Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		thread1.setPriority(3);
	}
}
