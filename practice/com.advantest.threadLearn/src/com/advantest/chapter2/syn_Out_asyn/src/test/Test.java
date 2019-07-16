package com.advantest.chapter2.syn_Out_asyn.src.test;

import com.advantest.chapter2.syn_Out_asyn.src.extthread.MyThreadA;
import com.advantest.chapter2.syn_Out_asyn.src.extthread.MyThreadB;
import com.advantest.chapter2.syn_Out_asyn.src.mylist.MyList;

public class Test {

	public static void main(String[] args) {
		MyList mylist = new MyList();

		MyThreadA a = new MyThreadA(mylist);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(mylist);
		b.setName("B");
		b.start();
	}

}
