package org.esudarshan.singleton.five;

// memory not wasted
// thread-safe
// best performance
public enum Singleton {

	SINGLETON;

	private int result;

	private Singleton() {
		System.out.println("Instance created");
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void printResult() {
		System.out.println(this.result);
	}

}
