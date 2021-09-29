/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package lruCache;

public class Node {

	int key;
	int value;
	Node next;
	Node prev;

	public Node( int key , int value) {
		this.key=key;
		this.value=value;
	}
}
