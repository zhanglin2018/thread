package com.advantest.chapter1.t4_threadsafe.extthread;

import com.advantest.chapter1.t4_threadsafe.controller.LoginServlet;

public class BLogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
