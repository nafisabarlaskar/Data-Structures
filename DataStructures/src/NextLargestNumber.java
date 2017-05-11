import java.util.*;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class NextLargestNumber {

    public static int getNextSmallestNumber(int inputNumber){
        int[] inputArray = new int[100];
        int result = inputNumber;

        int count = (int) Math.log10(inputNumber) + 1;
        int length = count;
        if(count!=0){
            count -= 1;
            while(count>=0){
                inputArray[count] = inputNumber%10;
                inputNumber /= 10;
                count--;
            }
        }
        int temp = 0;
        int index = 0;
        List linkedArrayList = new ArrayList();

        for (int i = 0; i < length; i++){
            for(int j = 0; j < length-1; j++){
                temp = inputArray[j+1];
                inputArray[j+1] = inputArray[j];
                inputArray[j] = temp;
                linkedArrayList.add(inputArray);
            }
        }
        Collections.sort(linkedArrayList);

        int res = 0;
        for(int i = 0; i < linkedArrayList.size(); i++){
            if(linkedArrayList.get(i).equals(Integer.valueOf(result))){
                res = (Integer) linkedArrayList.get(i+1);
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(getNextSmallestNumber(123));
    }
}
