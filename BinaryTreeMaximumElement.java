package test.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMaximumElement {
	
	public int getMaximumElement(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		int max=Integer.MIN_VALUE;
		while(!queue.isEmpty())
		{
			TreeNode n=queue.poll();
			if(n.getItem()>max)
			{
				max=n.getItem();
			}
			if(n.getLeft()!=null)
			{
				queue.add(n.getLeft());
			}
			if(n.getRight()!=null)
			{
				queue.add(n.getRight());
			}
		}
		return max;
	}
}
