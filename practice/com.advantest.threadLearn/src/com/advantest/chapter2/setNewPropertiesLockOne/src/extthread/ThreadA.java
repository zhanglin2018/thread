package com.advantest.chapter2.setNewPropertiesLockOne.src.extthread;

import com.advantest.chapter2.setNewPropertiesLockOne.src.entity.Userinfo;
import com.advantest.chapter2.setNewPropertiesLockOne.src.service.Service;

public class ThreadA extends Thread {

	private Service service;
	private Userinfo userinfo;

	public ThreadA(Service service, 
			Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}

}
