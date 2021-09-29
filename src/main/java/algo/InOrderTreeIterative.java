/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;


import java.util.Stack;

public class InOrderTreeIterative {

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
		InOrderTreeIterative tree_level = new InOrderTreeIterative();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
		tree_level.root.right.left=new Node(7);
		tree_level.root.right.right=new Node(8);
		System.out.println("In order traversal of binary tree is -  \n");
		tree_level.printInOrder();
	}

	void printInOrder() {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;

		//  reach till left most node of tree which is here 4
		while (curr != null || s.size() > 0) {

			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}


			// pop the last left leaf
			curr = s.pop();
			System.out.print(  curr.data + "  ");
			curr = curr.right;
		}
	}

}
