package Heap;

import java.util.*;

public class Heap {

    public class Pair{
        int val;
        int count;
        public int getCount(){
            return this.count;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public class Tuple implements Comparable<Tuple>{
        int x;
        int y;
        int val;
        public Tuple(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple o) {
            return this.val - o.val;
        }
    }
    public List<Integer> getTopKFrequentElements(int[] arr, int k){

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(Comparator.comparing(Pair::getCount));

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            Pair p = new Pair();
            p.setCount(m.getValue());
            p.setVal(m.getKey());
            priorityQueue.add(p);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        for(Pair p : priorityQueue){
            result.add(p.getVal());
        }
        return result;
    }

    public int kthSmallestInMatrix(int[][] matrix, int k){
        if(matrix.length == 0){
            return 0;
        }
        PriorityQueue<Tuple> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < matrix.length - 1; i++){
            priorityQueue.add(new Tuple(i, 0, matrix[i][0]));
        }
        for(int i = 0; i < k-1; i++){
            Tuple tuple = priorityQueue.poll();
            if(tuple.x == matrix.length-1){
                continue;
            }
            priorityQueue.add(new Tuple(tuple.x+1, tuple.y, matrix[tuple.x+1][tuple.y]));
        }
        return priorityQueue.peek().val;
    }
}
