package org.esudarshan.singleton.one;

// memory wastage
// thread-safe
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("Instance created");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
