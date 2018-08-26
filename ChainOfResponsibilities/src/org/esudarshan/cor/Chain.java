package org.esudarshan.cor;

public interface Chain {

	void setNextChain(Chain chain);

	void calculate(int num1, int num2, String op);
}
