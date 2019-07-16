package com.advantest.chapter2.synNotExtends.src.service;

public class Sub extends Main {

	@Override
	synchronized public void serviceMethod() {
		try {
			System.out.println("int sub sleep begin threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub sleep end threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
