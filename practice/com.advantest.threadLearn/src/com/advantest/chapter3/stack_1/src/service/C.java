package com.advantest.chapter3.stack_1.src.service;

import com.advantest.chapter3.stack_1.src.entity.MyStack;

public class C {

	private MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
