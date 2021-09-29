/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.Stack;

public class PreOrderIterativeTree {

	Node root;

	public static void main(String args[]) {
        /* creating a binary tree and entering
         the nodes *
         			 1
         		/	    \
			   2       	 3
             /  \
            4    5
         /
         */
		PreOrderIterativeTree tree_level = new PreOrderIterativeTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
		tree_level.root.right.left=new Node(7);
		tree_level.root.right.right=new Node(8);

		System.out.println("Pre order traversal of binary tree is - ");
		tree_level.printPreOrder();
	}

	private void printPreOrder() {

		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;

		s.push(curr);

		while(!s.isEmpty()) {
			curr=s.pop();
			System.out.println(curr.data);

			if(curr.right!=null)
				s.push(curr.right);

			if(curr.left!=null)
				s.push(curr.left);
		}



	}
}
