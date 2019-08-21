package G;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by NafisaBarlaskar on 20-04-2017.
 */
public class Anagram {

    public static int removeAnagram(String string1,String string2){

        int[] count1 = new int[100];
        int[] count2 = new int[100];

        for(int i = 0; i < string1.length(); i++){
            count1[(int)string1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < string2.length(); i++){
            count2[(int)string2.charAt(i) - 'a']++;
        }

        int result = 0;
        for(int i = 0 ; i <26; i++){
            result += java.lang.Math.abs(count1[i] - count2[i]);
        }

        return result;

    }

    public static boolean isAnagram(String firstString, String secondString){

        if(firstString != null && secondString != null){

            String string1 = firstString.toLowerCase().replaceAll("\\s", "");
            String string2 = secondString.toLowerCase().replaceAll("\\s", "");

            if(string1.length() != string2.length()){
                return false;
            }

            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1,array2)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args){
        String str1 = "bcadeh", str2 = "hea";
        System.out.println(removeAnagram(str1, str2));
        System.out.println(isAnagram(str1,str2));
    }
}
