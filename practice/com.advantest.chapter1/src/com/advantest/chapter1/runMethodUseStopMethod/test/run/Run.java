package com.advantest.chapter1.runMethodUseStopMethod.test.run;

import com.advantest.chapter1.randomThread.mythread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
