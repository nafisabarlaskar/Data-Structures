package DivideAndConquer;

public class FirstAndLastElementPosition {

    public static int[] getFirstAndLastPosition(int[] arr, int key){
        if(arr.length == 0){
            return new int[]{0, 0};
        }
        int[] result = new int[2];

        int low = 0;
        int high = arr.length - 1;

        //first occurrence
        while(low < high){
            int mid = low+(high - low)/2;
            if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }

        result[0] = low;

        low = 0;
        high = arr.length - 1;

        //last occurence
        while(low < high){
            int mid = low+(high - low)/2;
            if(arr[mid] > key){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }

        result[1] = high;
        return result;
    }

    public static void main(String[] args){
        int nums[] = {1, 1, 2, 2, 2, 2, 2, 3, 3, 4};
        int[] result = getFirstAndLastPosition(nums, 2);
        System.out.println("First Position: " + result[0] + " Last Position: " + result[1]);
    }
}
