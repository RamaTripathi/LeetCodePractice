/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

public class Mutable extends Immutable {
	private int realValue;

	public Mutable(int value) {
		super(value);

		realValue = value;
	}

	public int getValue() {
		return realValue;
	}
	public void setValue(int newValue) {
		realValue = newValue;
	}

	public static void main(String[] arg){
		Mutable obj = new Mutable(4);
		Immutable immObj = (Immutable)obj;
		System.out.println(immObj.getValue());
		obj.setValue(8);
		System.out.println(immObj.getValue());
	}
}
/*
otice that in my Mutable subclass, I've overridden the behavior of getValue to read a new, mutable field declared in my subclass.
As a result, your class, which initially looks immutable, really isn't immutable.
 I can pass this Mutable object wherever an Immutable object is expected,
  which could do Very Bad Things to code assuming the object is truly immutable.
  Marking the base class final prevents this from happening.
 */