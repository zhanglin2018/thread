package com.advantest.chapter1.t19.test;

import com.advantest.chapter1.t19.extthread.MyThread1;
import com.advantest.chapter1.t19.extthread.MyThread2;

/*
 * �ܽ᣺�����ȼ����߳����Ǵ󲿷���ִ���꣬�������������ȼ����߳�ȫ����
 * ��ִ����ɡ�
 * 
 * �̵߳����ȼ�����һ���Ĺ����ԣ�CPU������ִ����Դ�ø����ȼ��Ƚϸߵ��߳�
 * 
 * 
 */
public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(1);
			thread1.start();

			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(10);
			thread2.start();
		}
	}
}