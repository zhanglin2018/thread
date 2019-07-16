package com.advantest.chapter1.t17.test;

import com.advantest.chapter1.t17.extthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}

}
