package test;

import extthread.ThreadA;
import extthread.ThreadB;

/*
 * ��java�У��̵߳����ȼ����Ϊ1-10��10���ȼ������С��1 ���� ���� 10�� 
 * JDK���׳��쳣��throw new IllegalArgumentException()
 * MIN_PRIORITY = 1
 * NORM_PRIORITY = 5
 * MAX_PRIORITY = 10
 * ��˭���еĿ죺�����߳����첽ִ�еġ����ȼ��������еĴ����Ķ��� ���������ԵĹ�ϵ
 * 
 */


public class Run {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();

			ThreadB b = new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();

			Thread.sleep(2000);
			a.stop();
			b.stop();

			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
