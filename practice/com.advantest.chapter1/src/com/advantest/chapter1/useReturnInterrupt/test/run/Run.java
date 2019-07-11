package com.advantest.chapter1.useReturnInterrupt.test.run;

import com.advantest.chapter1.useReturnInterrupt.extthread.MyThread;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
