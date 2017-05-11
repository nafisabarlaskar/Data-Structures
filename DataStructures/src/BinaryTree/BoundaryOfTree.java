package BinaryTree;

import Nodes.Node;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class BoundaryOfTree {

    public static void printLeaves(TreeNode node){

        if(node!=null){
            printLeaves(node.getLeft());

            if(node.getLeft() == null & node.getRight() == null){
                System.out.println(node.getData());
            }

            printLeaves(node.getRight());
        }
    }

    public static void printLeftBoundary(TreeNode node){

        if(node!=null){
            if(node.getLeft()!=null){
                System.out.println(node.getData());
                node = node.getLeft();
            } else if(node.getRight()!=null){
                System.out.println(node.getData());
                node = node.getRight();
            }
        }
    }

    public static void printRightBoundary(TreeNode node){

        if(node!=null){
            if(node.getRight()!=null){
                node = node.getRight();
                System.out.println(node.getData());
            } else if(node.getLeft()!=null){
                node = node.getLeft();
                System.out.println(node.getData());
            }
        }
    }

    public static void printBoundary(TreeNode node){
        if(node!=null){
            System.out.println(node.getData());
            printLeftBoundary(node.getLeft());
            printLeaves(node.getLeft());
            printLeaves(node.getRight());
            printRightBoundary(node.getRight());
        }
    }

    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(12);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(14);
        tree.root.left.right.left = new TreeNode(22);
        tree.root.left.right.right = new TreeNode(25);
        printBoundary(tree.root);

    }
}
