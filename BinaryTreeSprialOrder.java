package test.binarytree;

import java.util.Stack;

public class BinaryTreeSprialOrder {
	
	
	public void sprialOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
		boolean directionFlag=false;
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			Stack<TreeNode> tempStack=new Stack<>();
			while(!stack.isEmpty())
			{
			TreeNode n=stack.pop();
			System.out.println("The item is :::" + n.getItem());
			if(!directionFlag)
			{
				if(n.getLeft()!=null)
				{
					tempStack.push(n.getLeft());
				}
				if(n.getRight()!=null)
				{
					tempStack.push(n.getRight());
				}
			}
			else {
				if(n.getRight()!=null)
				{
					tempStack.push(n.getRight());
				}
				if(n.getLeft()!=null)
				{
					tempStack.push(n.getLeft());
				}
			}
			}
			directionFlag=!directionFlag;
            stack=tempStack;
		}
		}
	}
