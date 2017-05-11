package BinaryTree;

/**
 * Created by NafisaBarlaskar on 20-04-2017.
 */
public class TreeNode {

    int data;
    int horizontalDistance = 0;
    TreeNode root = null;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    TreeNode(int data){
        this.data = data;
    }

    TreeNode(TreeNode node, int horizontalDistance){
        this.data = node.data;
        this.right = node.right;
        this.left = node.left;
        this.horizontalDistance = horizontalDistance;
    }

    TreeNode(){

    }
    public TreeNode getNode(){
        return new TreeNode(this.data, this.left, this.right);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public TreeNode getLeastCommonAncestor(TreeNode root, int smallNumber, int bigNumber){

        if(root == null)
            return root;

        if(root.getData() < smallNumber && root.getData() < bigNumber){
            return getLeastCommonAncestor(root.getRight(), smallNumber, bigNumber);
        }

        if(root.getData() > smallNumber && root.getData() > bigNumber){
            return getLeastCommonAncestor(root.getLeft(), smallNumber, bigNumber);
        }

        return root;
    }
}
