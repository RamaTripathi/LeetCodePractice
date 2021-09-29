/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

public class NonVegBurger extends Burger {

	@Override
	public String name() {
		return "Non-veg";
	}

	@Override
	public float price() {
		return 0.5f ;
	}
}
