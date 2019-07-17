package com.advantest.chapter3.TwoThreadTransData.src.test;
import com.advantest.chapter3.TwoThreadTransData.src.extthread.ThreadA;
import com.advantest.chapter3.TwoThreadTransData.src.extthread.ThreadB;
import com.advantest.chapter3.TwoThreadTransData.src.mylist.MyList;


public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
