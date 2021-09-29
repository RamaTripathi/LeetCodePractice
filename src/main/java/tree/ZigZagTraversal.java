/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

public class ZigZagTraversal {


	// driver program to test the above function
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.rootNode = new Node(1);
		tree.rootNode.left = new Node(2);
		tree.rootNode.right = new Node(3);
		tree.rootNode.left.left = new Node(7);
		tree.rootNode.left.right = new Node(6);
		tree.rootNode.right.left = new Node(5);
		tree.rootNode.right.right = new Node(4);

		System.out.println("ZigZag Order traversal of binary tree is");
		tree.printZigZagTraversal();
	}
}
/*
				1

		2				3

	7     6         5          4
 */