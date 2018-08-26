package org.esudarshan.singleton.three;

// memory not wasted
// thread-safe
// performance affected
public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("Instance created");
	}

	synchronized public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
