package TwoPointer;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int minSum = nums[0]+nums[1]+nums[nums.length-1];
        while(i < nums.length-2){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum <= target){
                    j++;
                }else{
                    k--;
                }
                if(Math.abs(sum - target) < Math.abs(minSum - target)){
                    minSum = sum;
                }
            }
            i++;
        }
        return minSum;

    }
}
