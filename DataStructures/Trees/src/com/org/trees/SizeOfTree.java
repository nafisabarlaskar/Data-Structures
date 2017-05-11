package com.org.trees;

public class SizeOfTree {
		
	public int CalculateSize(Node root)
	{
		if( root == null)
			return 0;
		else
			return( CalculateSize(root.left) + CalculateSize(root.right) + 1);
			
	}
}
