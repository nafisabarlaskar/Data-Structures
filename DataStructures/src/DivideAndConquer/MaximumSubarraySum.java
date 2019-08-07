package DivideAndConquer;

public class MaximumSubarraySum {

    public static int maxSum(int[] a){

        int maxSum = Integer.MIN_VALUE;
        int maxSumTillNow = 0;

        for(int i = 0; i < a.length; i++){
            maxSumTillNow = Math.max(maxSumTillNow + a[i], a[i]);
            maxSum = Math.max(maxSum, maxSumTillNow);
        }
        return maxSum;
    }

    public static int maxSumDivideAndConquer(int[] a, int left, int right){
        int maxLeftSum = Integer.MIN_VALUE;
        int maxRightSum = Integer.MIN_VALUE;
        if(left == right){
            return a[left];
        }
        int mid = (left+right)/2;

        int sum = 0;
        for(int i = mid; i >= left; i--){
            sum += a[i];
            maxLeftSum = Math.max(maxLeftSum, sum);
        }

        sum = 0;
        for(int i = mid+1; i <= right; i++){
            sum += a[i];
            maxRightSum = Math.max(maxRightSum, sum);
        }

        int maxSum = Math.max(maxSumDivideAndConquer(a, left, mid), maxSumDivideAndConquer(a, mid+1, right));
        return Math.max(maxSum, maxLeftSum+maxRightSum);
    }

    public static void main(String[] args){
        int[] a = { 2, -4, 1, 9, -6, 7, -3 };
        System.out.println("Maximum Subarray Sum: " + maxSum(a));
        System.out.println("Maximum Subarray Sum (D&C): " + maxSumDivideAndConquer(a, 0, a.length-1));

    }
}
