package test.binarytree;

import java.util.Stack;

public class BinaryTreePreOrder {
	
	//root, left,right
	public void preOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			TreeNode tempNode=stack.pop();
			System.out.println("value is ::::" +tempNode.getItem());
			if(tempNode.getRight()!=null)
			{
				stack.push(tempNode.getRight());
			}
			if(tempNode.getLeft()!=null)
			{
				stack.push(tempNode.getLeft());
			}
					
		}
		
	}

}
