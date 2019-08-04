package Heap;

import java.util.LinkedList;
import java.util.List;

public class SlidingWindow {

    public List<Integer> maxSlidingWindow(int[] nums, int k){
        List<Integer> result = new LinkedList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        if(nums.length == 0){
            return result;
        }

        for(int i = 0; i < nums.length; i++){
            while(!queue.isEmpty() && queue.peek() == i - k){
                queue.poll();
            }

            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.removeLast();
            }

            queue.offer(i);

            if(i+1 >= k){
                result.add(nums[queue.peek()]);
            }
        }
        return result;
    }
}
