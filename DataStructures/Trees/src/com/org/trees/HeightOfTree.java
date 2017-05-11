package com.org.trees;

public class HeightOfTree {

	int maxHeight(Node root)
	{
		int leftTreeHeight, rightTreeHeight;
		if( root == null)
			return 0;
		else
		{
			leftTreeHeight = maxHeight(root.left);
			rightTreeHeight = maxHeight(root.right);
			
			if (leftTreeHeight > rightTreeHeight)
				return (leftTreeHeight + 1);
			else
				return(rightTreeHeight + 1);
		}
	}
}
