package DivideAndConquer;

public class SmallestMissingNumber {

    public static int getSmallestMissingNumber(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid] == mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }


    public static void main(String[] args){
        int nums[] = {0, 1, 2, 3, 4, 6, 9, 11, 15};
        int result = getSmallestMissingNumber(nums);
        System.out.println("Number Missing: " + result);
    }
}
