package test.binarytree;

public class BinaryTreeCountLeafNodes {
	
	public int count(TreeNode root)
	{
		if( root == null ) return 0;
		if(root.getLeft()==null && root.getRight()==null)
		{
			return 1;
		}
		else
		{
			return count(root.getLeft()) + count(root.getLeft());
		}
		
	}

}
