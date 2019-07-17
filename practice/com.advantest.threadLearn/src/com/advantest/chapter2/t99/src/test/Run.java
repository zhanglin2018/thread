package com.advantest.chapter2.t99.src.test;

import com.advantest.chapter2.t99.src.printstring.PrintString;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();

		System.out.println("stopThread=" + Thread.currentThread().getName());

		printStringService.setContinuePrint(false);
	}

}
