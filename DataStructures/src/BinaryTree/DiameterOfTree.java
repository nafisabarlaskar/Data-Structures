package BinaryTree;

/**
 * Created by NafisaBarlaskar on 23-04-2017.
 */
public class DiameterOfTree {

    public static int getDiameterOfTree(TreeNode node){

        int rightDiameter = 0;
        int leftDiameter = 0;

        if(node == null){
            return 0;
        }

        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());

        leftDiameter = getDiameterOfTree(node.getLeft());
        rightDiameter = getDiameterOfTree(node.getRight());

        return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter,rightDiameter));
    }

    public static int getHeight(TreeNode node){
        if(node == null)
            return 0;
        return (1+ Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));
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

        System.out.println("Diameter of the tree is " + getDiameterOfTree(tree.root));
    }
}
