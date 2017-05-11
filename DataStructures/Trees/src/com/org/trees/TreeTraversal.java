package com.org.trees;

public class TreeTraversal extends Node{

	
	Node root;
	
	public TreeTraversal() {
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

	public static void main(String[] args) {
			
		TreeTraversal tree = new TreeTraversal();
		TreeTraversal tree1 = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.root.left.right.left = new Node(6);
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder();
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder();
        
        SizeOfTree size = new SizeOfTree();
        System.out.println("Size of tree is " + size.CalculateSize(tree.root));
        
        IsIdentical isIdentical = new IsIdentical();
        boolean value = isIdentical.IsIdenticalTree(tree.root, tree1.root);
        
        if(value)
        	System.out.println("Trees are identical");
        else
        	System.out.println("Trees are not identical");
        
        HeightOfTree height = new HeightOfTree();
        
        System.out.println("Height of  tree1 is " + height.maxHeight(tree.root) + " and of tree2 is " + height.maxHeight(tree1.root));
        
	}

}
