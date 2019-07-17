package com.advantest.chapter3.wait_notify_size5.src.extthread;

import com.advantest.chapter3.wait_notify_size5.src.extlist.MyList;

public class ThreadA extends Thread {

	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				if (MyList.size() != 5) {
					System.out.println("wait begin "
							+ System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end  "
							+ System.currentTimeMillis());
					System.out.println(MyList.size());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
