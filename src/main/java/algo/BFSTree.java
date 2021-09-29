/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {

	Node root;

	void printLevelOrder()
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node tempData=queue.poll();
			System.out.println(tempData.data);
			if(tempData.left!=null)
				queue.add(tempData.left);

			if(tempData.right!=null)
			queue.add(tempData.right);
		}
	}

	public static void main(String args[])
	{
        /* creating a binary tree and entering
         the nodes */
		BFSTree tree_level = new BFSTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
				tree_level.printLevelOrder();
	}

}
