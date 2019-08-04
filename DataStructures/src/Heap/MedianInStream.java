package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianInStream {

    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;

    public MedianInStream(){
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>();
    }

    public void addNum(int num){
        maxheap.offer(num);
        minheap.offer(maxheap.poll());
        if(maxheap.size() < minheap.size()){
            maxheap.offer(minheap.poll());
        }
    }

    public int findMedian(){
        if(maxheap.size() == minheap.size()){
            return (minheap.peek() + maxheap.peek())/2;
        }else{
            return maxheap.peek();
        }
    }
}
