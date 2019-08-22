package Strings;

public class CustomSortString {

    public String customSortString(String S, String T) {

        int i = 0, j = 0, k = 0;
        char[] t = T.toCharArray();
        for(i = 0; i < S.length() - 1; i++){
            char c = S.charAt(i);
            while(j < T.length() && k < T.length()){

                if(t[j] == c){
                    char temp = t[k];
                    t[k++] = c;
                    t[j] = temp;
                }
                j++;
            }
            j = k;
        }

        return String.valueOf(t);
    }
}
