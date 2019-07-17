package com.advantest.chapter3.waitOld.src.test;

import com.advantest.chapter3.waitOld.src.entity.Add;
import com.advantest.chapter3.waitOld.src.entity.Subtract;
import com.advantest.chapter3.waitOld.src.extthread.ThreadAdd;
import com.advantest.chapter3.waitOld.src.extthread.ThreadSubtract;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");

		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);

		ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
		subtract1Thread.setName("subtract1Thread");
		subtract1Thread.start();

		ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
		subtract2Thread.setName("subtract2Thread");
		subtract2Thread.start();

		Thread.sleep(10000);

		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();

	}

}
