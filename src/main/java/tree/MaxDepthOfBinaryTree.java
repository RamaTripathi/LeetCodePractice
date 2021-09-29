/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree {
	Node root;

	/* Given a binary tree. Print its nodes in level order
	   using array for implementing queue */
	int size() {
		return calculateMaxDepthOfTreeUsingRecursion(root);
	}

	public static void main(String args[]) {
		MaxDepthOfBinaryTree tree = new MaxDepthOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println(calculateMaxDepthOfTreeUsingRecursion(tree.root));
	}

	private static int calculateMaxDepthOfTreeUsingRecursion(Node node) {
		if (node == null) return 0;
		else
			return Math.max( calculateMaxDepthOfTreeUsingRecursion(node.left) ,
					calculateMaxDepthOfTreeUsingRecursion(node.right) )+ 1;
	}

	// not correct solution
	private static int calculateMaxDepthOfTreeUsingIteratiom(Node node) {
	Queue<Node> q = new LinkedList<Node>();
	int height=0;
	if(node!=null)
		q.add(node);

	int nodeCount = q.size();
	while(!q.isEmpty()) {


		Node n = q.poll();
		height++;

		if (node.left != null)
			q.add(node.left);
		if (node.right != null)
			q.add(node.right);
	}
	return 0;
	}
}