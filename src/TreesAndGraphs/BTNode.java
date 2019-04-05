package TreesAndGraphs;

public class BTNode {

	public int value;
	public BTNode left;
	public BTNode right;
	
	public BTNode (int value) {
		this.value=value;
	}
	
	public BTNode getLeft() {
		return this.left;
	}
	public BTNode getRight() {
		return this.right;
	}
	public void setLeft(BTNode node) {
		this.left=node;
	}
	public void setRight(BTNode node) {
		this.right=node;
	}
	public BTNode clone()
	{
		return new BTNode(this.value);
	}
	public boolean isEqual(BTNode node) {
		return this.value==node.value?true:false;
	}
	public boolean isLessThan(BTNode node) {
		return this.value<node.value?true:false;
	}
	

}
