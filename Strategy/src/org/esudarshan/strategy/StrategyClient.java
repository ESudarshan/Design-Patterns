package org.esudarshan.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		ColletionUtils.sort(new BubbleSort());
		ColletionUtils.sort(new SelectionSort());
	}

}
