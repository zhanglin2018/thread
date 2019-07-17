package com.advantest.chapter3.stack_3.src.service;

import com.advantest.chapter3.stack_3.src.entity.MyStack;

public class P {

	private MyStack myStack;

	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void pushService() {
		myStack.push();
	}
}
