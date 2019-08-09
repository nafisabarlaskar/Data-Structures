package Heap;

import java.util.PriorityQueue;

public class KClosestPointsFromOrigin {

    public int[][] kClosest(int[][] points, int K) {

        int[][] result = new int[K][2];
        PriorityQueue<Pair> queue = new PriorityQueue<>((n1, n2) -> n1.distance - n2.distance);

        for(int i = 0; i < points.length; i++){
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            queue.offer(new Pair(distance, i));
        }

        int i = 0;

        while(i < K){
            Pair p = queue.poll();
            result[i][0] = points[p.index][0];
            result[i][1] = points[p.index][1];
            i++;
        }
        return result;
    }

    public class Pair{
        int distance;
        int index;

        public Pair(int distance, int index){
            this.distance = distance;
            this.index = index;
        }
    }
}
