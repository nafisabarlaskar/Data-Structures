package DivideAndConquer;

public class SearchInRotatedArray {

    public int searchInRotatedArray(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low+high)/2;
            if(key == arr[mid]){
                return mid;
            }

            if(arr[mid] <= arr[high]){
                if(arr[mid] < key && key <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid - 1;
                }
            }else{
                if(arr[mid] > key && key >= arr[low]){
                    high = mid - 1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
