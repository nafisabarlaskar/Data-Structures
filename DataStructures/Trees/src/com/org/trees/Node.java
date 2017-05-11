package com.org.trees;

public class Node {

	int key;
	Node left, right, root;
	
	public Node(int key)
	{
		this.key = key;
		left = right = null;
	}
	
	public Node()
	{
		Node root = null;
	}
}
