/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.startegy;

public class OpeartionDivide implements Strategy{
	@Override
	public int doOperation(int num1, int num2) {
		return num1/num2;
	}
}
