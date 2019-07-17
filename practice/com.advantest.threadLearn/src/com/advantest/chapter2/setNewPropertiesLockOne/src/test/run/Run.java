package com.advantest.chapter2.setNewPropertiesLockOne.src.test.run;
import com.advantest.chapter2.setNewPropertiesLockOne.src.entity.Userinfo;
import com.advantest.chapter2.setNewPropertiesLockOne.src.extthread.ThreadA;
import com.advantest.chapter2.setNewPropertiesLockOne.src.extthread.ThreadB;
import com.advantest.chapter2.setNewPropertiesLockOne.src.service.Service;


public class Run {

	public static void main(String[] args) {

		try {
			Service service = new Service();
			Userinfo userinfo = new Userinfo();
			
			userinfo.setUsername("zhanglin");
			userinfo.setPassword("hanjiaojiao");
			
			ThreadA a = new ThreadA(service, userinfo);
			a.setName("a");
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(service, userinfo);
			b.setName("b");
			b.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
