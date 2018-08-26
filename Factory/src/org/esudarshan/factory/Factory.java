package org.esudarshan.factory;

public class Factory {

	public Animal getAnimal(String type) {
		if ("DOG".equalsIgnoreCase(type)) {
			return new Dog();
		} else if ("CAT".equalsIgnoreCase(type)) {
			return new Cat();
		}
		return null;
	}

}
