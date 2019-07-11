package com.advantest.chapter1.t14.exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止!进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
