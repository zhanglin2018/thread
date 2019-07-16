package com.advantest.chapter2.synNotExtends.src.controller;

import com.advantest.chapter2.synNotExtends.src.extthread.MyThreadA;
import com.advantest.chapter2.synNotExtends.src.extthread.MyThreadB;
import com.advantest.chapter2.synNotExtends.src.service.Sub;

public class Test {

	public static void main(String[] args) {
		Sub subRef = new Sub();

		MyThreadA a = new MyThreadA(subRef);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(subRef);
		b.setName("B");
		b.start();
	}

}
