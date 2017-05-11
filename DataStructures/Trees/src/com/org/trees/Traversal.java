package com.org.trees;

public class Traversal extends Node {

	public Traversal()
	{
		super();
	}
	
	void printPostOrder(Node node)
	{
		if(node == null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		
		System.out.println(node.key);
		
	}
	
	void printPreOrder(Node node)
	{
		if(node == null)
			return;
		
		System.out.println(node.key);
		
		printPreOrder(node.left);
		printPreOrder(node.right);
		
	}

	void printInOrder(Node node)
	{
		if(node == null)
			return;
		
		printInOrder(node.left);
		
		System.out.println(node.key);
		
		printInOrder(node.right);
		
	}

	void printPostOrder()  
	{     
		printPostOrder(root);  
	}
    void printInOrder()    
    {     
    	printInOrder(root);   
    }
    void printPreOrder()   
    {     
    	printPreOrder(root);  
    }

}
