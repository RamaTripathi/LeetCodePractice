/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

public class Node {

	int data;
	Node left;
	Node right;

	public Node(int item) {
		this.data=item;
		left=null;
		right=null;
	}

	public Node(int item,Node l , Node r) {
		this.data=item;
		left=l;
		right=r;
	}
	boolean isLeaf() {
		return left == null ? right == null : false;
	}

}



