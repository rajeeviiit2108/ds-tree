package test.binarytree;

public class BinaryTreeRootToLeafPath {
	
	public void rootToLeafPath(TreeNode root, int[] path, int len)
	{
		if(root==null) return;
		
		path[len]=root.getItem();
		len++;
		
		if(root.getLeft()==null && root.getRight()==null)
		{
			for(int i=0; i<len; i++)
			{
				System.out.println(" " + path[i]);
			}
			System.out.println();
		}
		rootToLeafPath(root.getLeft(), path, len);
		rootToLeafPath(root.getRight(), path, len);
	}

}
