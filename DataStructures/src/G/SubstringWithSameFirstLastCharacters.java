package G;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class SubstringWithSameFirstLastCharacters {

    public static int getCountOfSubstring(String inputString){

        int count = 0;
        for (int i = 0; i < inputString.length(); i++){
            for (int j = i+1; j < inputString.length(); j++){
                if(inputString.charAt(i) == inputString.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(getCountOfSubstring("abacab"));
    }
}
