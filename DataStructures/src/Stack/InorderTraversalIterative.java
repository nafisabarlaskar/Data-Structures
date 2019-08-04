package Stack;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {

    public List<Integer> getIterativeInorderTraversal(TreeNode node){
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = node;
        while (curr != null || !stack.empty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            result.add(curr.getData());
            curr = curr.getRight();
        }
        return result;
    }
}
