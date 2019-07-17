package com.advantest.chapter3.pipeInputOutput.src.extthread;

import java.io.PipedOutputStream;

import com.advantest.chapter3.pipeInputOutput.src.service.WriteData;


public class ThreadWrite extends Thread {

	private WriteData write;
	private PipedOutputStream out;

	public ThreadWrite(WriteData write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}

	@Override
	public void run() {
		write.writeMethod(out);
	}

}
