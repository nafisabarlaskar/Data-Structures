package DivideAndConquer;

public class DivideTwoNumbers {

    public static double divide(int a, int b){

        double low = 0;
        double high = Integer.MAX_VALUE;
        int sign = 1;

        if(a * b < 0){
            sign = -1;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        double precision = 0.001;
        while(true){
            double mid = (low+high)/2;

            if(Math.abs(mid * b - a) <= precision){
                return  mid*sign;
            }else if(b * mid > a){
                high = mid;
            }else{
                low = mid;
            }
        }

        //return Integer.MIN_VALUE;
    }

    public static void main(String[] args){
        int a = 110;
        int b = 2;
        System.out.println(a + "/" + b + " = " + divide(a, b));
    }
}
