/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.ArrayList;
import java.util.List;

public class InOrderTree {

	Node root;

	public InOrderTree() {
		root = null;
	}

	void printInOrder(Node node)
	{
		if(node==null)
			return;

		printInOrder(node.left);
		System.out.print(node.data + " ");
		printInOrder(node.right);
	}

	// Driver method
	public static void main(String[] args)
	{
		List<Integer> al =new ArrayList<Integer>();
		InOrderTree tree = new InOrderTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInOrder(tree.root);
	}
}
