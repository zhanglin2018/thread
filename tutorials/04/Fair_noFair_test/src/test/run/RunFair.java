package test.run;

import service.Service;

public class RunFair {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(true);

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("�߳�" + Thread.currentThread().getName()
						+ "������");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}

	}
}
