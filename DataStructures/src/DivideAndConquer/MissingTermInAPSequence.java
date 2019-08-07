package DivideAndConquer;

public class MissingTermInAPSequence {

    public static int findMissingTerm(int[] a){

        int n = a.length;
        int commonDifference = (a[n-1] - a[0])/n;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low+high)/2;
            if((mid - 1 >= 0 && a[mid] - a[mid-1] != commonDifference)){
                return a[mid-1] + commonDifference;
            }
            if((mid+1 < n && a[mid+1] - a[mid] != commonDifference)){
                return a[mid+1] - commonDifference;
            }
            if(a[mid] - a[0] != mid * commonDifference){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1, 4, 7, 10, 16};
        System.out.println("Missing term is " + findMissingTerm(a));
    }
}
