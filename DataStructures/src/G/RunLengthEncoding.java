package G;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class RunLengthEncoding {

    public static void displayRunEncoding(String inputString){

        int[] hashArray = new int[1000];
        int data = (int)inputString.charAt(0);
        for(int i = 0; i < inputString.length(); i++){
            hashArray[(int)inputString.charAt(i)] += 1;
        }
        String outputString = null;

        for(int i = 0; i < inputString.length();){
                outputString += String.valueOf(inputString.charAt(i));
                outputString += String.valueOf(hashArray[(int)inputString.charAt(i)]);
                int j = (int)inputString.charAt(i);
                //hashArray[j] = 0;
                i += (int)hashArray[(int)inputString.charAt(i)];
        }
        System.out.println(outputString);
    }

    public static void main(String[] args){
        displayRunEncoding("geeksforgeeks");
    }
}
