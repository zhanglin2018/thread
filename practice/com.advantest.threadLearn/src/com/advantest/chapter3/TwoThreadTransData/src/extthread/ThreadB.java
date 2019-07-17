package extthread;

import mylist.MyList;

public class ThreadB extends Thread {

	private MyList list;

	public ThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (list.size() == 5) {
					System.out.println("==5了，线程b要退出了！");
					throw new InterruptedException();
				}
				Thread.sleep(10);
//				System.out.println(Thread.currentThread().getName() + list.size());
//				synchronized (list) {
//					
//				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
