package service;

public class Service {

	volatile private boolean  isContinueRun = true;

	 public void runMethod() {
		String anyString = new String();
//		synchronized(anyString) {
//			
		
		while (isContinueRun == true) {
//			synchronized (this) {
//			}
		}
		System.out.println("ͣ�����ˣ�");
	}

    public void stopMethod() {
		isContinueRun = false;
	}
}
