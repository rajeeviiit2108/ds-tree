package test.binarytree;

import java.util.TreeMap;

public class BinaryTreeVerticalSum {
	
	public TreeMap<Integer, Integer> verticalSum(TreeNode treeNode, TreeMap<Integer, Integer> treeMap, int level)
	{
		if(treeNode==null) return null;
		verticalSum(treeNode.getLeft(), treeMap, level-1);
		
		if(treeMap. get(level)!=null)
		{
			treeMap.put(level, treeMap.get(level)+treeNode.getItem());
		}
		else {
			treeMap.put(level, treeNode.getItem());
		}
		verticalSum(treeNode.getLeft(), treeMap, level+1);
		
		return treeMap;
	}

}
