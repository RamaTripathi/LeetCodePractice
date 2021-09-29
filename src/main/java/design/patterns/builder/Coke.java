/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

public class Coke extends ColdDrink{
	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 0.75f;
	}
}
