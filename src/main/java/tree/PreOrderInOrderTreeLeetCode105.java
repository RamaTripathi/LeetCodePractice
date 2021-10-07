/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

public class PreOrderInOrderTreeLeetCode105 {

	public static void main(String args[]) {

	}
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		TreeNode root = buildTreeHelper(0,0,inorder.length,preorder,inorder);

		return root;
	}
	/*
Our aim is to find out the index of right child for current node in the preorder array
We know the index of current node in the preorder array - preStart (or whatever your call it), it's the root of a subtree
Remember pre order traversal always visit all the node on left branch before going to the right ( root -> left -> ... -> right),
 therefore, we can get the immediate right child index by skipping all the node on the left branches/subtrees of current node
The inorder array has this information exactly. Remember when we found the root in "inorder" array we immediately
 know how many nodes are on the left subtree and how many are on the right subtree
Therefore the immediate right child index is preStart + numsOnLeft + 1
(remember in preorder traversal array root is always ahead of children nodes but you don't know
which one is the left child which one is the right, and this is why we need inorder array)
numsOnLeft = root - inStart.
	 */

	public static TreeNode buildTreeHelper(int preStart,int inStart,int inEnd, int[] preorder, int[] inorder) {

		if((preStart>=preorder.length-1 || inStart >= inorder.length-1)) return  null;
		TreeNode root =  new TreeNode(preorder[preStart]);
		int InIndex=0;
		for(int i=inStart ;i <=inEnd ;i++) {
			if(inorder[i]== root.val)
				InIndex=i;
		}
		root.left=buildTreeHelper( preStart + 1 ,inStart,InIndex-1,preorder,inorder);
		root.right=buildTreeHelper( preStart+InIndex-inStart+1,InIndex + 1, inEnd, preorder, inorder);
		return root;

	}
}
