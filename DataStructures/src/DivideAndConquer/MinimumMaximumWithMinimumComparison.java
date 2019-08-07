package DivideAndConquer;

public class MinimumMaximumWithMinimumComparison {

    public static int[] findMinMax(int[] a){
        int maximum = a[0];
        int minimum = a[0];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < a.length-1; i++){
            maximum = Math.max(maximum, a[i]);
            minimum = Math.min(minimum, a[i]);
            max = Math.max(max, maximum);
            min = Math.min(min, minimum);
        }

        if(a.length % 2 == 1){
            max = Math.max(max, a[a.length - 1]);
            min = Math.min(min, a[a.length - 1]);
        }
        return new int[]{min, max};
    }

    public static void main(String[] args){
        int[] a = {4, 7, 5, 1, 3, 11, 0};
        int[] result = findMinMax(a);
        System.out.println("Minimum is : " + result[0] + " Maximum is : " + result[1]);
    }
}
