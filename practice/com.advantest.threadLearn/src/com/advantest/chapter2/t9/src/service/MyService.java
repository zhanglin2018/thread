package com.advantest.chapter2.t9.src.service;

import com.advantest.chapter2.t9.src.mylist.MyOneList;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
//			synchronized (list) {
				if (list.getSize() < 1) {
					Thread.sleep(2000);
					list.add(data);
//				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}

}
