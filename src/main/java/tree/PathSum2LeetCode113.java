/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum2LeetCode113 {
	public static void main(String args[]) {

	}
	public static void findPaths(TreeNode root, int sum, List<Integer> current, List<List<Integer>> paths) {
		if(root == null ) return ;
		current.add(root.val);
		if(root.val == sum && root.left == null && root.right == null) {
			paths.add(current);
			return;
		}
		findPaths(root.left, sum-root.val,  new ArrayList<Integer>(current), paths);
		findPaths(root.right, sum-root.val, new ArrayList<Integer>(current), paths);
	}

}
