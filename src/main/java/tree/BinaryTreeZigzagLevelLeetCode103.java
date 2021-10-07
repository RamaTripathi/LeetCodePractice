/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelLeetCode103 {
	public static void main(String args[]) {

	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res= new ArrayList<List<Integer>>();
		if(root==null) return null;
		Stack<TreeNode> currentLevel= new Stack<TreeNode>();
		Stack<TreeNode> nextLevel= new Stack<TreeNode>();

		boolean leftToRight=false;
		currentLevel.push(root);
		List<Integer> levelList= new ArrayList<Integer>();

		while(!currentLevel.isEmpty()) {
			TreeNode node=currentLevel.pop();
			levelList.add(node.val );
			if(leftToRight) {
				if(node.left!=null)
					nextLevel.push(node.left);
				if(node.right!=null)
					nextLevel.push(node.right);
			}
			else{
				if(node.right!=null)
					nextLevel.push(node.right);
				if(node.left!=null)
					nextLevel.push(node.left);
				}

			if(currentLevel.isEmpty()){
				leftToRight=!leftToRight;
				Stack<TreeNode>  temp= new Stack<TreeNode>();
				temp=currentLevel;
				currentLevel=nextLevel;
				res.add(levelList);
				levelList= new ArrayList<Integer>();
			}

		}
		return res;

	}
}
