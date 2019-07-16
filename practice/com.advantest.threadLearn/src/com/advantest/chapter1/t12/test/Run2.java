package com.advantest.chapter1.t12.test;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("stop1: " + Thread.interrupted());
		System.out.println("stop2: " + Thread.interrupted());
		System.out.println("end!");
	}
}
