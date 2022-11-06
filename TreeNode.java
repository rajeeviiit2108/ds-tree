package test.binarytree;

public class TreeNode {
	private int item;
	private TreeNode left;
	private TreeNode right;
	public TreeNode(int item)
	{
		this.item=item;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
}
