package TwoPointer;

import java.util.LinkedList;
import java.util.List;

public class IntervalIntersection {

    public int[][] intervalIntersection(int[][] A, int[][] B) {

        List<Interval> list = new LinkedList<>();
        int i = 0;
        int j = 0;
        while(i < A.length && j < B.length){
            int a = Math.max(A[i][0], B[j][0]);
            int b = Math.min(A[i][1], B[j][1]);
            if(a <= b){
                list.add(new Interval(a, b));
            }
            if(A[i][1] < B[j][1]){
                i++;
            }else{
                j++;
            }
        }
        int[][] result = new int[list.size()][2];
        int k = 0;
        for(Interval p : list){
            result[k][0] = p.a;
            result[k][1] = p.b;
            k++;
        }

        return result;

    }

    public class Interval{
        int a;
        int b;

        public Interval(int a, int b){
            this.a = a;
            this.b = b;
        }

    }
}
