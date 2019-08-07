package DivideAndConquer;

public class Power {

    public static int pow(int x, int n){

        if(n == 0){
            return 1;
        }

        int pow = pow(x, n/2);
        if(n % 2 == 1){
            return pow * x * pow;
        }
        return pow*pow;
    }

    public static void main(String[] args){
        int result = pow(-2, 12);
        System.out.println(result);
    }
}
