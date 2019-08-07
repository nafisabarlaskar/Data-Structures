package DivideAndConquer;

public class PeakElement {

    public static int findPeak(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int peak = -1;
        while (low<high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == arr.length-1 || arr[mid+1] <= arr[mid])){
                peak = mid;
                break;
            }else if(mid - 1 >= 0 && arr[mid-1] > arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return peak;
    }

    public static void main(String[] args){
        int nums[] =  { 8, 9, 10, 2, 5, 6 };
        int result = findPeak(nums);
        System.out.println("Peak: " + nums[result]);
    }
}
