package service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	public Condition condition2 = lock.newCondition();

	public void await() {
		try {
			lock.lock();
			System.out.println(" awaitʱ��Ϊ" + System.currentTimeMillis());
			condition.await();
			System.out.println("awaitʱ��Ϊ��" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signal() {
		try {
			lock.lock();
			System.out.println("signalʱ��Ϊ" + System.currentTimeMillis());
			condition.signal();
			Thread.sleep(1000);
			System.out.println("zhanglin");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
