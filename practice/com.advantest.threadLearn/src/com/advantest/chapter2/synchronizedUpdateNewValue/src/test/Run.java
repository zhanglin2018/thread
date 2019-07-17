package com.advantest.chapter2.synchronizedUpdateNewValue.src.test;
import com.advantest.chapter2.synchronizedUpdateNewValue.src.extthread.ThreadA;
import com.advantest.chapter2.synchronizedUpdateNewValue.src.extthread.ThreadB;
import com.advantest.chapter2.synchronizedUpdateNewValue.src.service.Service;


public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB(service);
			b.start();

			System.out.println("stop command");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
