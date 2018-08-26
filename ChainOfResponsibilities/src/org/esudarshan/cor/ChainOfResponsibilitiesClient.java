package org.esudarshan.cor;

public class ChainOfResponsibilitiesClient {

	public static void main(String[] args) {

		Chain chain1 = new Addition();
		Chain chain2 = new Subtraction();
		chain1.setNextChain(chain2);

		chain1.calculate(4, 2, "ADD");
		chain1.calculate(4, 2, "SUB");
		chain1.calculate(4, 2, "MUL");

	}
}
