package com.advantest.chapter3.test1.src.test;

public class Test2 {

	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn before");
			
			synchronized (lock) {
				System.out.println("syn ");
				lock.wait();
				System.out.println("wait ");
			}
			
			System.out.println("syn after");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
