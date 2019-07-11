package com.advantest.chapter1.t2.test;

import com.advantest.chapter1.t2.myrunnable.MyRunnable;

public class Run {

	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("ÔËĞĞ½áÊø!");
	}

}
