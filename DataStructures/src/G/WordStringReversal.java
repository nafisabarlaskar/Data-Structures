package G;

/**
 * Created by NafisaBarlaskar on 21-04-2017.
 */
public class WordStringReversal {

    public static String reverseWordsInString(String inputString){

        String[] words = inputString.split(" ");
        String reverseString = "";

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String reverseWord = "";

            for(int j = word.length()-1; j >= 0; j--){
                reverseWord += word.charAt(j);
            }

            reverseString += reverseWord + " ";
        }
        System.out.println(reverseString);
        return reverseString;
    }

    public static String  reverseString(String inputString){
        String reverseString = "";
        String input = inputString;
        for(int i = input.length()-1 ; i >= 0 ; i-- ){
            reverseString += input.charAt(i);
        }
        System.out.println(reverseString);
        return reverseString;
    }

    public static void main(String[] args){
        reverseString(reverseWordsInString("When you are just open look at the stars"));
    }
}
