package com.advantest.chapter3.stack_2_new_final.src.service;

import com.advantest.chapter3.stack_2_new_final.src.entity.MyStack;

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
