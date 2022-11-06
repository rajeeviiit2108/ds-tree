package test.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeReverseOfLevelOrder {
	
	
	public void reverseOfLevelOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
	
		Queue<TreeNode> queue=new LinkedList<>();
		Stack<TreeNode> stack=new Stack<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode tempNode=queue.poll();
			if(tempNode.getRight()!=null)
			{
				queue.add(tempNode.getRight());
			}
			if(tempNode.getLeft()!=null)
			{
				queue.add(tempNode.getLeft());
			}
			stack.push(tempNode);
		}
		while(!stack.isEmpty())
		{
			System.out.println("The item is :::" + stack.pop().getItem());
		}
		}
	}
