package com.advantest.chapter1.currentThreadExt.test;

import com.advantest.chapter1.currentThreadExt.mythread.CountOperate;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	}

}
