package org.esudarshan.singleton.four;

// memory not wasted
// thread-safe
// better performance
public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("Instance created");
	}

	synchronized public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
