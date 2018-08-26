package org.esudarshan.cor;

public class Subtraction implements Chain {

	Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(int num1, int num2, String op) {
		if ("SUB".equalsIgnoreCase(op)) {
			System.out.println(op + " : " + num1 + " - " + num2 + " = " + (num1 - num2));
		} else {
			System.out.println(op + " : " + "Supported operations are = ADD, SUB");
		}

	}

}
