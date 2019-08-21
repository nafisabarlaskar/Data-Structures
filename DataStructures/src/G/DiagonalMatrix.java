package G;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class DiagonalMatrix {

    private static final int MAX = Integer.MAX_VALUE;

    public static void printDiagonalMatrix(int array[][], int length){

        int i = 0;
        int j = 0;

        boolean isUp = true;

        for(int k = 0; k < length*length;){

            if(isUp){

                for( ; i>=0 && j<length; i--, j++ ){
                    System.out.println(array[i][j]);
                    k++;
                }

                if(j==length){
                    i +=2;
                    j--;
                }
                if( i < 0 && (j == length-1 || j == length-2)){
                    i = 0;
                }
            } else {
                for( ; j>=0 && i<length; j--, i++ ){
                    System.out.println(array[i][j]);
                    k++;
                }

                if(i==length){
                    j +=2;
                    i--;
                }
                if( j < 0 && (i == length-1 )){
                    j = 0;
                }
            }
            isUp = !isUp;
        }
    }

    public static void main(String[] args){
        int[][] arr = new int[100][100];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        printDiagonalMatrix(arr,3);
    }
}
