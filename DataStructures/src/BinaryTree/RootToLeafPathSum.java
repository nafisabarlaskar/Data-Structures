package BinaryTree;

/**
 * Created by NafisaBarlaskar on 23-04-2017.
 */
public class RootToLeafPathSum {

    public static boolean hasPathSum(TreeNode node, int sum){

        if(node == null)
            return (sum == 0);

        int subSum = sum - node.data;
        boolean answer = false;
        if(subSum == 0 && node.getLeft() == null && node.getRight() == null){
            return true;
        }
        if(node.getLeft()!=null){
            answer = answer || hasPathSum(node.getLeft(),subSum);
        }
        if (node.getRight()!=null){
            answer = answer || hasPathSum(node.getRight(),subSum);
        }
        return answer;
    }

    public static void main(String[] args){

        TreeNode tree = new TreeNode();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(12);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(14);
        tree.root.left.right.left = new TreeNode(22);
        if(hasPathSum(tree.root, 8)){
            System.out.println("The binary tree has a path from root to leaves with the sum 38 ");
        } else {
            System.out.println("The binary tree doesn't have a path from root to leaves with the sum 38");
        }

    }
}
