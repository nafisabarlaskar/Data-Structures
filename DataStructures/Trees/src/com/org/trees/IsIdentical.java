package com.org.trees;

public class IsIdentical {

	Node root1, root2;
	
	public boolean IsIdenticalTree(Node root1, Node root2)
	{
		if( root1 == null &&  root2 == null)
			return true;
		if(root1 != null && root2 != null)
			return( root1.key == root2.key && IsIdenticalTree(root1.left, root2.left) && 
						IsIdenticalTree(root1.right, root2.right));
		
		return false;
	}
	
}
