package test.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder {
	
	
	public void levelOrderTraversal(TreeNode root)
	{
		if( root == null ) return;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode n=queue.poll();
			System.out.println("the element is :::" +n.getItem());
			if(n.getLeft()!=null)
			{
				queue.add(n.getLeft());
			}
			if(n.getRight()!=null)
			{
				queue.add(n.getRight());
			}
			
		}
		}
	}
