package org.esudarshan.factory;

public class FactoryClient {

	public static void main(String[] args) {

		Factory factory = new Factory();
		Animal animal = factory.getAnimal("Dog");
		animal.makeSomeNoise();

		animal = factory.getAnimal("Cat");
		animal.makeSomeNoise();
	}
}
