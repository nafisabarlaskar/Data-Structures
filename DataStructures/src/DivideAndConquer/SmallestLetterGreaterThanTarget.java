package DivideAndConquer;

public class SmallestLetterGreaterThanTarget {

    public static char getSmallestLetter(char[] c, char t){

        int low = 0;
        int n = c.length;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(c[mid] <= t){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return c[low % n];
    }

    public static void main(String[] args){
        char[] c = {'c', 'f', 'j'};
        System.out.println(getSmallestLetter(c, 'k'));
    }
}
