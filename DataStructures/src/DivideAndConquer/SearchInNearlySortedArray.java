package DivideAndConquer;

public class SearchInNearlySortedArray {


    public static void main(String[] args)
    {
        int[] A = { 2, 1, 3, 5, 4, 7, 6, 8, 9 };
        int key = 7;

        int index = searchElement(A, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    private static int searchElement(int[] a, int key) {

        int low = 0;
        int high = a.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == key){
                return mid;
            }else if(mid - 1 >= low && a[mid-1] == key){
                return mid-1;
            }else if(mid + 1 <= high && a[mid+1] == key){
                return mid+1;
            }else if(a[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }


}
