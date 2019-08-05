package Queue;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SpiralOrderTraversal {

    public List<TreeNode> spiralOrderTraversal(TreeNode root){
        List<TreeNode> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size > 0){
                if (flag) {
                    TreeNode n = ((LinkedList<TreeNode>) queue).pollLast();
                    result.add(n);
                    if (n.getRight() != null) {
                        ((LinkedList<TreeNode>) queue).offerFirst(n.getRight());
                    }
                    if (n.getLeft() != null) {
                        ((LinkedList<TreeNode>) queue).offerFirst(n.getLeft());
                    }
                } else {

                    TreeNode n = ((LinkedList<TreeNode>) queue).pollFirst();
                    result.add(n);
                    if (n.getLeft() != null) {
                        ((LinkedList<TreeNode>) queue).offerLast(n.getLeft());
                    }
                    if (n.getRight() != null) {
                        ((LinkedList<TreeNode>) queue).offerLast(n.getRight());
                    }
                }
                flag = !flag;
                size--;
            }
        }
        return result;
    }
}
