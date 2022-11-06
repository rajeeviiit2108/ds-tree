package test.binarytree;

public class BinaryTreeLeafNodes {
	
	public void printLeafNodes(TreeNode root)
	{
		if( root == null ) return;
		if(root.getLeft()==null && root.getRight()==null)
		{
			System.out.println("The leaf node is :::" +root.getItem());
			return;
		}
		printLeafNodes(root.getLeft());
		printLeafNodes(root.getRight());
	}

}
