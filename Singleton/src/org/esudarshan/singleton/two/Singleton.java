package org.esudarshan.singleton.two;

// memory not wasted
// not thread-safe
public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("Instance created");
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
