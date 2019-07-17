package com.advantest.chapter3.pipeReaderWriter.src.test;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

import com.advantest.chapter3.pipeReaderWriter.src.extthread.ThreadRead;
import com.advantest.chapter3.pipeReaderWriter.src.extthread.ThreadWrite;
import com.advantest.chapter3.pipeReaderWriter.src.service.ReadData;
import com.advantest.chapter3.pipeReaderWriter.src.service.WriteData;

public class Run {

	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);

			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();

			Thread.sleep(2000);

			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
