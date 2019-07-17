package com.advantest.chapter3.pipeReaderWriter.src.extthread;

import java.io.PipedWriter;

import com.advantest.chapter3.pipeReaderWriter.src.service.WriteData;

public class ThreadWrite extends Thread {

	private WriteData write;
	private PipedWriter out;

	public ThreadWrite(WriteData write, PipedWriter out) {
		super();
		this.write = write;
		this.out = out;
	}

	@Override
	public void run() {
		write.writeMethod(out);
	}

}
