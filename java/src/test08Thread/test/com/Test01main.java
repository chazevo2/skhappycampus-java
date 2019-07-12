package test08Thread.test.com;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread!!!");

		// ½º·¹µå : Thread, Runnable
		System.out.println("hello...start");

		// 1. extends Thread
//		Thread t = new ThreadEx();
//		t.start();
		new ThreadEx().start();

		// 2. inner class
//		Thread t2 = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 10; i < 20; i++) {
//					System.out.println(i);
//				}
//			}
//		};
//		t2.start();
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 10; i < 20; i++) {
					System.out.println(i);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		// 3. implements Runnable
		
//		Runnable r = new RunnableImpl();
//		Thread t3 = new Thread(r);
//		t3.start();
		new Thread(new RunnableImpl()).start();

		System.out.println("hello...end");
	}

}
