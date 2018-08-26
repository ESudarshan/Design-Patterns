package org.esudarshan.singleton.three;

public class SingletonClient {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton.getInstance();
			}
		});
		t1.start();
		t2.start();
	}

}
