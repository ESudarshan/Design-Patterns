package org.esudarshan.singleton.five;

public class SingletonClient {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton singleton = Singleton.SINGLETON;
				singleton.setResult(5);
				singleton.printResult();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton singleton = Singleton.SINGLETON;
				singleton.printResult();
			}
		});
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}
