package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights){
        if(heights == null || heights.length == 0){
            return 0;
        }

        int maxHeight = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(i = 0; i < heights.length; i++){
            if(stack.isEmpty() || heights[stack.peek()] < heights[i]){
                stack.push(i++);
            }else{
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxHeight = Math.max(maxHeight, (w * h));
            }
        }

        while (!stack.isEmpty()){
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxHeight = Math.max(maxHeight, (w * h));
        }
        return maxHeight;
    }
}
