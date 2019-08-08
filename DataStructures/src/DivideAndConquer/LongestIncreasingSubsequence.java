package DivideAndConquer;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] a){
        int len = 0;
        int i = 0;
        int n = a.length;
        int[] dp = new int[n];
        while(i < n){
            int p = Arrays.binarySearch(dp, 0, len, a[i]);
            if(p < 0){
                p = -(p+1);
            }
            dp[p] = a[i];
            if(p == len){
                len++;
            }
            i++;
        }
        return len;
    }

    public static void main(String[] args){
        int[] a = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(a));

    }
}
