package com.advantest.chapter3.TwoThreadTransData.src.extthread;

import com.advantest.chapter3.TwoThreadTransData.src.mylist.MyList;

public class ThreadA extends Thread {

	private MyList list;

	public ThreadA(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("add " + (i + 1) + " element");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
