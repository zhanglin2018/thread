package com.advantest.chapter3.wait_notify_insert_test.src.test.run;

import com.advantest.chapter3.wait_notify_insert_test.src.extthread.BackupA;
import com.advantest.chapter3.wait_notify_insert_test.src.extthread.BackupB;
import com.advantest.chapter3.wait_notify_insert_test.src.service.DBTools;

public class Run {

	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for (int i = 0; i < 10; i++) {
			BackupB output = new BackupB(dbtools);
			output.start();
			BackupA input = new BackupA(dbtools);
			input.start();
		}
	}

}
