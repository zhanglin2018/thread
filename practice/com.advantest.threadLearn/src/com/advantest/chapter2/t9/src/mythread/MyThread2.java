package com.advantest.chapter2.t9.src.mythread;

import com.advantest.chapter2.t9.src.mylist.MyOneList;
import com.advantest.chapter2.t9.src.service.MyService;

public class MyThread2 extends Thread {

	private MyOneList list;

	public MyThread2(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "B");
	}

}