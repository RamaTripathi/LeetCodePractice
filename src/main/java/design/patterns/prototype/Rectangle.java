/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.prototype;

public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
