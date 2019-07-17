package com.advantest.chapter2.synchronizedUpdateNewValue.src.service;

public class Service {

	 volatile private boolean  isContinueRun = true;

	 public void runMethod() {
		String anyString = new String();
//		synchronized(anyString) {
//			
		
		while (isContinueRun == true) {
			synchronized (this) {
			}
		}
		System.out.println("run Method is stoped");
	}

    public void stopMethod() {
		isContinueRun = false;
	}
}
