package DivideAndConquer;

public class FloorAndCeilingOfANumber {

    public static int[] getFloorAndCeil(int[] arr, int k){
        int[] result = new int[2];
        return result;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 4, 6, 8, 9 };

        for (int i = 0; i <= 10; i++)
        {
            System.out.print("Number " + i + " -> ");
            System.out.println("ceiling is " + getCeil(A, i)
                    + ", floor is " + getFloor(A, i));
        }
    }

    private static int getFloor(int[] a, int i) {
        int floor = -1;
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == i){
                floor = mid;
                break;
            }else if(i < a[mid]){
                high = mid - 1;
            }else{
                floor = mid;
                low = mid + 1;
            }
        }

        return floor == -1 ? -1 : a[floor];
    }

    private static int getCeil(int[] a, int i) {
        int ceil = -1;
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == i){
                ceil = mid;
                break;
            }else if(i < a[mid]){
                ceil = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ceil == -1 ? -1 : a[ceil];
    }
}
