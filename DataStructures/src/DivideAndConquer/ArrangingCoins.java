package DivideAndConquer;

public class ArrangingCoins {

    public static int arrangeCoins(int n){

        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;
            int val = (mid * (mid+1))/2;
            if(val < n && (n - val) < (mid+1)){
                return mid;
            }else if(val < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(arrangeCoins(5));
    }
}
