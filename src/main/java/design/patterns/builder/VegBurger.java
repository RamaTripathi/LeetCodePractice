/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

public class VegBurger extends Burger{
	@Override
	public String name() {
		return "Veg-Burger";
	}

	@Override
	public float price() {
		return 0.25f;
	}
}
