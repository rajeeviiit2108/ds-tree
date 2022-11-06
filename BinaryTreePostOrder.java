package test.binarytree;

import java.util.Stack;

public class BinaryTreePostOrder {
	
	//left,right,root
	public void postOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
		Stack<TreeNode> stack=new Stack<>();
		TreeNode current=root;
		while(true)
		{
			if(current!=null)
			{
				if(current.getRight()!=null)
				{
					stack.push(current.getRight());
				}
				stack.push(current);
				current=current.getLeft();
				continue;
			}
		if(stack.isEmpty()) {
			return;
		}
		current=stack.pop();
		if(current.getRight()!=null && !stack.isEmpty() 
				&& current.getRight()==stack.peek())
		{
			stack.pop();
			stack.push(current);
			current=current.getRight();
		}
		else {
			System.out.println("item is ::::" + current.getItem());
			current=null;
		}
			
			
		}
					
		}
		
	}
