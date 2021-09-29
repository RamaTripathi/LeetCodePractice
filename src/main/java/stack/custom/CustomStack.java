/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package stack.custom;

public class CustomStack {
	int[] arr;
 	int top;
	int size;

	public CustomStack(int size) {
		this.size=size;
		this.arr =new int[size];
		this.top=-1;
	}


	public void push( int data) {
		if( !isFull()){
			top++;
			arr[top]=data;
		}
		else
			throw new RuntimeException("Stack is full");

	}

	public void pop(){
		if(!isEmpty()) {
			arr[top]=0;
			top--;

		}

	}

	private boolean isEmpty() {
		return (top == -1);
	}

	private boolean isFull() {
		return  (top ==size);
	}
}
