package DivideAndConquer;

public class CountOccurencesWithDuplicates {

    public static int getCount(int[] nums, int k){

        int first = 0;
        int last = 0;
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
                first = result;
            }else{
                last = result;
            }
            i--;
            searchFirst = false;
        }
        return last - first + 1;
    }

    public static void main(String[] args){
        int nums[] = {1, 1, 2, 2, 2, 2, 2, 3, 3, 4};
        int count = getCount(nums, 2);
        System.out.println("Count - " + count);
    }
}
