package BinaryTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by NafisaBarlaskar on 23-04-2017.
 */
public class VerticalOrderTraversal {

    public static void printTopViewOfTree(TreeNode node){

        if(node == null)
            return;

        HashSet<Integer> hashSet = new HashSet<>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(new TreeNode(node, 0));

        while(!queue.isEmpty()){

            TreeNode firstNode = queue.poll();

            int horizontalDistance = firstNode.horizontalDistance;

            if(!hashSet.contains(horizontalDistance)){
                hashSet.add(horizontalDistance);
                System.out.println(firstNode.getData());
            }

            if(firstNode.getLeft()!=null){
                queue.add(new TreeNode(firstNode.getLeft(), horizontalDistance-1));
            }
            if(firstNode.getRight()!=null){
                queue.add(new TreeNode(firstNode.getRight(), horizontalDistance+1));
            }
        }
    }

    public static void printVerticalOrderTraversal(TreeNode node){

        if(node == null)
            return;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> printQueue = new LinkedList<TreeNode>();
        queue.add(new TreeNode(node, 0));
        printQueue.add(new TreeNode(node, 0));

        while(!queue.isEmpty()){

            TreeNode firstNode = queue.poll();

            int horizontalDistance = firstNode.horizontalDistance;

            if(firstNode.getLeft()!=null){
                queue.add(new TreeNode(firstNode.getLeft(), horizontalDistance-1));
                printQueue.add(new TreeNode(firstNode.getLeft(), horizontalDistance-1));
            }
            if(firstNode.getRight()!=null){
                queue.add(new TreeNode(firstNode.getRight(), horizontalDistance+1));
                printQueue.add(new TreeNode(firstNode.getRight(), horizontalDistance+1));
            }
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
        System.out.println("Vertical Order Traversal");
        printTopViewOfTree(tree.root);
    }
}
