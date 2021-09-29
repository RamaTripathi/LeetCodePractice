/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.startegy;

public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy=strategy;
	}

	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
