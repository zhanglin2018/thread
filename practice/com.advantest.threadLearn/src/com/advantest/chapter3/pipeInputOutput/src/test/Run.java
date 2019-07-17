package com.advantest.chapter3.pipeInputOutput.src.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import com.advantest.chapter3.pipeInputOutput.src.extthread.ThreadRead;
import com.advantest.chapter3.pipeInputOutput.src.extthread.ThreadWrite;
import com.advantest.chapter3.pipeInputOutput.src.service.ReadData;
import com.advantest.chapter3.pipeInputOutput.src.service.WriteData;


public class Run {

	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);

			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();

			Thread.sleep(10000);

			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
