package Strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void generateParenthesis(int n, List<String> result, int l, int r, StringBuilder sb){

        if( l > r){
            return;
        }
        if(l == 0 && r == 0){
            result.add(sb.toString());
            return;
        }

        if(l > 0){
            generateParenthesis(n, result, l-1, r, sb.append("("));
        }
        if(r > 0){
            generateParenthesis(n, result, l, r-1, sb.append(")"));
        }
    }

    public static void main(String[] args){
        int n = 4;
        List<String> result = new ArrayList<>();
        generateParenthesis(n, result, n, n, new StringBuilder(""));
        result.forEach(r -> System.out.println(r));
    }
}
