package test.binarytree;

import java.util.Stack;

public class BinaryTreeInOrder {
	
	//left,root,right
	public void inOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
		Stack<TreeNode> stack=new Stack<>();
		TreeNode current=root;
		
		while(!stack.isEmpty() || current!=null)
		{
			if(current!=null)
			{
				stack.push(current);
				current=current.getLeft();
			}
			else {
				TreeNode n=stack.pop();
				System.out.println("the item is ::::" + n.getItem());
				current=n.getRight();
			}
			
		}
	}

}
