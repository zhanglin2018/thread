package com.advantest.chapter3.TwoThreadTransData.src.mylist;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();

	public void add() {
		list.add("Apple XR");
	}

	public int size() {
		return list.size();
	}

}
