package DivideAndConquer;

public class MinimumSubarraySum {

    public static int findMinimumSize(int[] a, int s){
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            while(sum >= s){
                minLen = Math.min(minLen, i - left + 1);
                sum -= a[left++];
            }
        }
        return minLen;
    }

    public static void main(String[] args){
        int[] a = {2,3,1,2,4,3};
        System.out.println(findMinimumSize(a, 7));
    }
}
