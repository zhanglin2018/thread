package com.advantest.chapter1.t4_threadsafe.extthread;

import com.advantest.chapter1.t4_threadsafe.controller.LoginServlet;

public class ALogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
