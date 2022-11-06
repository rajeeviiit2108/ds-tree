package test.binarytree;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeNode root=BinaryTree.createBinaryTree();

		System.out.println("==== Pre-Order Traversal ====");
		BinaryTreePreOrder preOrder=new BinaryTreePreOrder();
		preOrder.preOrderTraversal(root);
		
		System.out.println("==== In-Order Traversal ====");
		BinaryTreeInOrder inOrder=new BinaryTreeInOrder();
		inOrder.inOrderTraversal(root);
		
		System.out.println("==== Post-Order Traversal ====");
		BinaryTreePostOrder postOrder=new BinaryTreePostOrder();
		postOrder.postOrderTraversal(root);
		
		System.out.println("==== Level-Order Traversal ====");
		BinaryTreeLevelOrder levelOrder=new BinaryTreeLevelOrder();
		levelOrder.levelOrderTraversal(root);
		
		System.out.println("==== Reverse of Level-Order Traversal ====");
		BinaryTreeReverseOfLevelOrder reverseOfLevelOrder=new BinaryTreeReverseOfLevelOrder();
		reverseOfLevelOrder.reverseOfLevelOrderTraversal(root);
		
		System.out.println("==== Sprial-Order Traversal ====");
		BinaryTreeSprialOrder sprialOrder=new BinaryTreeSprialOrder();
		sprialOrder.sprialOrderTraversal(root);
		
		System.out.println("==== Print Leaf Nodes ====");
		BinaryTreeLeafNodes leafNodes=new BinaryTreeLeafNodes();
		leafNodes.printLeafNodes(root);
		
		System.out.println("==== Count Leaf Nodes ====");
		BinaryTreeCountLeafNodes countLeafNodes=new BinaryTreeCountLeafNodes();
		System.out.println("The total number of leaf nodes :::" +countLeafNodes.count(root));
		
		System.out.println("==== Maximum Element ====");
		BinaryTreeMaximumElement maximumElement=new BinaryTreeMaximumElement();
		System.out.println("The maximum element is :::" +maximumElement.getMaximumElement(root));
		
		System.out.println("==== All path from root to leaf path ====");
		BinaryTreeRootToLeafPath rootToLeafPath=new BinaryTreeRootToLeafPath();
		rootToLeafPath.rootToLeafPath(root, new int[1000], 0);		
		
		System.out.println("==== Vertical Sum ====");
		TreeMap<Integer, Integer> treeMap =new TreeMap<Integer, Integer>();
		BinaryTreeVerticalSum verticalSum=new BinaryTreeVerticalSum();
		TreeMap<Integer, Integer> sumMap=verticalSum.verticalSum(root, treeMap, 0);
		
		for(Entry<Integer,Integer> entry:sumMap.entrySet())
		{
            System.out.println("Sum :::"+entry.getValue());
		}
		
		System.out.println("==== Level Of Node ====");
		BinaryTreeLevelOfNode level=new BinaryTreeLevelOfNode();
		System.out.println("The level of node  :::" +level.getLevelOfNode(root, 20, 1));
		
		
    }
 }
