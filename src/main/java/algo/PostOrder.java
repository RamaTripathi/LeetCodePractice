/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

public class PostOrder {

	Node root;

	public PostOrder() {
		root = null;
	}

	private void printPostOrder(Node root) {

	}

	// Driver method
	public static void main(String[] args)
	{
		PostOrder tree = new PostOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printPostOrder(tree.root);
	}


}
