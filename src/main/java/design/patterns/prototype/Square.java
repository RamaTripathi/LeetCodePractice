/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.prototype;

public class Square extends Shape{
	public Square() {
		type="square";
	}
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
