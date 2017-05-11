package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by NafisaBarlaskar on 23-04-2017.
 */
public class LevelOrderTraversal {

    public static void printLevelOrderTraversal(TreeNode node){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode firstNode = queue.poll();
            System.out.println(firstNode.getData());
            if(firstNode.getLeft()!=null){
                queue.add(firstNode.getLeft());
            }
            if(firstNode.getRight()!=null){
                queue.add(firstNode.getRight());
            }
        }
    }

    public static void printSpiralLevelOrder(TreeNode node){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        boolean zigZag = true;

        while(!queue.isEmpty()) {
            TreeNode firstNode = queue.poll();
            if (zigZag) {
                System.out.println(firstNode.getData());
                if (firstNode.getLeft()!=null){
                    queue.add(firstNode.getLeft());
                }
                if(firstNode.getRight()!=null){
                    queue.add(firstNode.getRight());
                }
                zigZag = false;
            } else {
                System.out.println(firstNode.getData());
                if(firstNode.getRight()!=null){
                    queue.add(firstNode.getRight());
                }
                if (firstNode.getLeft()!=null){
                    queue.add(firstNode.getLeft());
                }
                zigZag = true;
            }
        }

    }

    public static int maximumWidth(TreeNode node){

        int level = 0;
        int maximumWidth = 0;
        int width = 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        TreeNode node1 = new TreeNode();
        node1.setData(-999);
        node1.setLeft(null);
        node1.setRight(null);
        queue.add(node1);
        level++;
        maximumWidth++;

        while (!queue.isEmpty()){
            TreeNode firstNode = queue.poll();
            if(firstNode.getLeft()!=null){
                queue.add(firstNode.getLeft());
                width++;
            }
            if (firstNode.getRight()!=null){
                queue.add(firstNode.getRight());
                width++;
            }

            if(firstNode.getData() == -999){
                queue.add(node1);
                level++;
                if(width>maximumWidth){
                    maximumWidth = width;
                }
                width = 0;
            }
        }
        return maximumWidth;
    }

    public static void main(String[] args){

        TreeNode tree = new TreeNode();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(12);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(14);
        tree.root.left.right.left = new TreeNode(22);
        System.out.println("Level Order Traversal");
        printLevelOrderTraversal(tree.root);
        //System.out.println("Level Order Traversal in Spiral form");
        printSpiralLevelOrder(tree.root);
        int width = maximumWidth(tree.root);
        System.out.println("Maximum width of the tree is " + width);
    }
}
