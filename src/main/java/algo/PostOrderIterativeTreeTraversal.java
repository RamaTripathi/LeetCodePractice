/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.Stack;

public class PostOrderIterativeTreeTraversal {

	Node root;

	public static void main(String args[]) {
         /* creating a binary tree and entering
         the nodes *
         			 1
         		/	    \
			   2       	 3
             /  \		/ \
            4    5     7   8
         /
         */
		PostOrderIterativeTreeTraversal tree_level = new PostOrderIterativeTreeTraversal();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
		tree_level.root.right.left=new Node(7);
		tree_level.root.right.right=new Node(8);
		System.out.println("In order traversal of binary tree is -  \n");
		tree_level.printPostOrder();
	}

	private void printPostOrder() {
		Stack<Node> nodes = new Stack<>();
		nodes.push(root);

		while (!nodes.isEmpty()) {
			Node current = nodes.peek();
			if (current.isLeaf()) {
				Node node = nodes.pop();
				System.out.printf("%s ", node.data);
			}
			else {
				if (current.right != null) {
					nodes.push(current.right);
					current.right = null;
				}
				if (current.left != null) {
					nodes.push(current.left);
					current.left = null;
				}
			}
		}
	}

}
