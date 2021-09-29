/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
