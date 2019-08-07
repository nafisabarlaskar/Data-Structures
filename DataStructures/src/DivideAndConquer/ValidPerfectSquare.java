package DivideAndConquer;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int x){
        int low = 1;
        int high = x;

        while(low < high){
            int mid = low + (high - low)/2;
            if(mid * mid == x){
                return true;
            }else if(mid * mid > x){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(49));
    }
}
