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
}
