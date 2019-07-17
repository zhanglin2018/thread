package com.advantest.chapter3.pipeInputOutput.src.extthread;

import java.io.PipedInputStream;

import com.advantest.chapter3.pipeInputOutput.src.service.ReadData;

public class ThreadRead extends Thread {

	private ReadData read;
	private PipedInputStream input;

	public ThreadRead(ReadData read, PipedInputStream input) {
		super();
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}
