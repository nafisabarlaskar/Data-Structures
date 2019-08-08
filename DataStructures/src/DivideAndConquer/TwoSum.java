package DivideAndConquer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSumUsingHashMap(int[] a, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            if(map.containsKey(target - a[i])){
                return new int[] {map.get(target - a[i]), i};
            }
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] findTwoSumBinary(int[] a, int target){

        Arrays.sort(a);

        int low = 0;
        int high = a.length - 1;
        while (low < high){
            int sum = a[low] + a[high];
            if(sum == target){
                return new int[]{low, high};
            }else if(sum > target){
                high--;
            }else{
                low++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] r = {2, 7, 11, 13};
        int[] result = findTwoSumBinary(r, 9);
        System.out.println(result[0] + " - " + result[1]);
    }
}
