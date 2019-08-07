package DivideAndConquer;

public class NumberOfOnesInBinaryArray {

    public static int getCountOfOnes(int[] arr){

        int low = 0;
        int high = arr.length-1;
        int start = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == 1){
                start = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return arr.length - start;
    }

    public static void main(String[] args){
        int nums[] = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        int result = getCountOfOnes(nums);
        System.out.println("Number of ones: " + result);
    }
}
