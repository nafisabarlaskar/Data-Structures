package DivideAndConquer;

public class SearchInsertPosition {

    public static int getInsertPosition(int[] a, int x){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] == x){
                return mid;
            }else if(a[mid] > x){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6};
        System.out.println(getInsertPosition(arr, 0));
    }
}
