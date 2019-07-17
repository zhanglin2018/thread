package com.advantest.chapter2.t10.src.test;

import com.advantest.chapter2.t10.src.printstring.PrintString;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
