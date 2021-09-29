/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package tree;

import java.util.Stack;

public class BinaryTree {
	Node rootNode;

	void printZigZagTraversal()
	{
		if(rootNode == null)
			return ;

		boolean isLeftToRight=true;
		Stack<Node> currentLevel = new Stack<Node>();
		Stack<Node> nextLevel = new Stack<Node>();
		currentLevel.push(rootNode);

		while(!currentLevel.isEmpty())
		{
			Node node =currentLevel.pop();
			System.out.print("   " + node.data + "  ");
			if(isLeftToRight) {
				if(node.left!=null)
					nextLevel.push(node.left);
				if(node.right!=null)
					nextLevel.push(node.right);
			}
			else {
				if(node.right!=null)
					nextLevel.push(node.right);
				if(node.left!=null)
					nextLevel.push(node.left);
			}
			if(currentLevel.isEmpty())
			{
				isLeftToRight=!isLeftToRight;
				Stack<Node> temp = currentLevel;
				currentLevel= nextLevel;
				nextLevel = temp;
			}


		}
	}
}
/*
				1  next = [2,3]

		2				3   righToLeft  pop=[3]  next= [2,4,5]   leftToRight pop=[2] next =[4,5,7,6]

	7     6         5          4  pop=[ 4,5,6,7]
 */