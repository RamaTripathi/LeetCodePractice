/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.LinkedList;
import java.util.Queue;

public class DFSTree {
	Node root;

	void preOrder(Node node)
	{
		if(node!=null)
			System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);


	}

	public static void main(String args[])
	{
        /* creating a binary tree and entering
         the nodes */
		DFSTree dfs_level = new DFSTree();
		dfs_level.root = new Node(1);
		dfs_level.root.left = new Node(2);
		dfs_level.root.right = new Node(3);
		dfs_level.root.left.left = new Node(4);
		dfs_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		dfs_level.preOrder(dfs_level.root);
	}
}
