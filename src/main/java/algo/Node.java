/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

public class Node {

	int data;
	Node left;
	Node right;

	public Node(int item) {
		this.data=item;
		left=null;
		right=null;
	}
	boolean isLeaf() {
		return left == null ? right == null : false;
	}

}



