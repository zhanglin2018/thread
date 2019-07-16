package com.advantest.chapter2.synNotExtends.src.service;

public class Main {

	synchronized public void serviceMethod() {
		try {
			System.out.println("int main sleep begin threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main sleep end threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
