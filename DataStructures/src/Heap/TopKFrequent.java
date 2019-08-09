package Heap;

import java.util.*;

public class TopKFrequent {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<String> q = new PriorityQueue<>((n1, n2) ->
                map.get(n1) == map.get(n2) ? n2.compareTo(n1) : map.get(n1) - map.get(n2));


        for(String w : map.keySet()){
            q.offer(w);
            if(q.size() > k){
                q.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while(q.size() > 0){
            result.add(q.poll());
        }
        Collections.reverse(result);
        return result;

    }
}
