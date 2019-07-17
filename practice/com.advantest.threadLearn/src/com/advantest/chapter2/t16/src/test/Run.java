package com.advantest.chapter2.t16.src.test;

import com.advantest.chapter2.t16.src.extthread.RunThread;

public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			
			Thread.sleep(1000);
			
			thread.setRunning(false);
			System.out.println("false");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
