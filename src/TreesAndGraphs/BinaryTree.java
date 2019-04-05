package TreesAndGraphs;

public class BinaryTree {
	
	public BTNode root;
	
	public BinaryTree() {
		this.root=null;
	}
	
	public boolean isEmpty() {
		return root==null?true:false;
	}
	
	public void insert(BTNode node) {

		if(isEmpty())
		{
			root = node;
		}
		else
		{
			BTNode temp = root;
			BTNode parent = root;
			
			while(temp != null)
			{
				parent = temp;
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
			
			if(node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
		
	}
	
	public void delete(BTNode nodeToDelete)
	{
		
		
		
	}
	
	
	
	public boolean isLeaf(BTNode node)
	{
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(BTNode node)
	{
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}
	
	

}
