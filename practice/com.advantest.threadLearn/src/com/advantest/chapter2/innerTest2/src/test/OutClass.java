package com.advantest.chapter2.innerTest2.src.test;

public class OutClass {
	static class InnerClass1 {
		public void method1(InnerClass2 class2) {
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName + " InnerClass1 method1");
				for (int i = 0; i < 10; i++) {
					System.out.println(threadName + " " +  i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

					}
				}
				System.out.println(threadName + " InnerClass1 method1");
			}
		}

		public synchronized void method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " InnerClass1 method2");
			for (int j = 0; j < 10; j++) {
				System.out.println(threadName + " " +  j);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
			}
			System.out.println(threadName + " InnerClass1 method2");
		}
	}

	static class InnerClass2 {
		public synchronized void method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " InnerClass2 method1");
			for (int k = 0; k < 10; k++) {
				System.out.println(threadName  + " " +  k);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
			}
			System.out.println(threadName + " InnerClass2 method1");
		}
	}
}
