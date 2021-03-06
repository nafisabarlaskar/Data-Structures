package DivideAndConquer;

public class FirstAndLastElementPosition {

    public static int[] getFirstAndLastPosition(int[] nums, int k){
        if(nums.length == 0){
            return new int[]{0, 0};
        }
        int[] res = new int[2];

        int i = 2;
        int result = -1;

        boolean searchFirst = true;
        while(i > 0){
            int low = 0;
            int high = nums.length-1;
            while(low <= high){
                int mid = (low+high)/2;
                if(nums[mid] == k){
                    result = mid;
                    if(searchFirst){
                        high = mid-1;
                    }else{
                        low = mid+1;
                    }
                }else if(nums[mid] < k){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            if(searchFirst) {
                res[0] = result;
            }else{
                res[1] = result;
            }
            i--;
            searchFirst = false;
        }
        return res;
    }

    public static void main(String[] args){
        int nums[] = {1, 1, 2, 2, 2, 2, 2, 3, 3, 4};
        int[] result = getFirstAndLastPosition(nums, 0);
        System.out.println("First Position: " + result[0] + " Last Position: " + result[1]);
    }
}
