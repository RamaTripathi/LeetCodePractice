/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

public class Pepsi extends ColdDrink{
	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 0.25f;
	}
}
