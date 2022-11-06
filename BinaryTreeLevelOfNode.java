package test.binarytree;

public class BinaryTreeLevelOfNode {
	
	public int getLevelOfNode(TreeNode treeNode, int key, int level)
	{
		if(treeNode==null) return 0;
		if(key==treeNode.getItem())
		{
			return level;
		}
		int result=getLevelOfNode(treeNode.getLeft(), key,level+1);
		if(result!=0)
		{
			return result;
		}
		result =getLevelOfNode(treeNode.getRight(), key,level+1);
		return result;
	}

}
