package com.advantest.chapter1.t4_threadsafe.test;

import com.advantest.chapter1.t4_threadsafe.extthread.ALogin;
import com.advantest.chapter1.t4_threadsafe.extthread.BLogin;

public class Run {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}

}
