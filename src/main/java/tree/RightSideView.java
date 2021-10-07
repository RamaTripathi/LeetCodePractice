/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class RightSideView {
	public static void main(String args[]) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.left.right=new TreeNode(5);
		root.right=new TreeNode(3);
		root.right.right=new TreeNode(4);
		for(Integer val : rightSideView(root)) {
			System.out.print("  " + val);
		}
	}

	public static  List<Integer> rightSideView(TreeNode root) {
		if (root == null) return new ArrayList<Integer>();

		ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>(){{ offer(root); }};
		List<Integer> rightside = new ArrayList();
		while (!queue.isEmpty()) {
			int levelLength = queue.size();

			for(int i = 0; i < levelLength; ++i) {
				TreeNode node = queue.poll();
				// if it's the rightmost element
				if (i == levelLength - 1) {
					rightside.add(node.val);
				}

				// add child nodes in the queue
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		return rightside;
	}
}
