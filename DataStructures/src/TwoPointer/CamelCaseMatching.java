package TwoPointer;

import java.util.LinkedList;
import java.util.List;

public class CamelCaseMatching {

    public static List<Boolean> camelMatch(String[] queries, String pattern) {

        List<Boolean> result = new LinkedList<>();
        if(queries == null || queries.length == 0 || pattern == null){
            return result;
        }

        for(String s : queries){
            int j = 0, i = 0;
            StringBuilder sb = new StringBuilder();
            while(j < s.length()){
                Character c1 = s.charAt(j);
                int v1 = c1;
                Character c = i < pattern.length() ? pattern.charAt(i) : null;

                if(c == c1){
                    sb.append(c1);
                    i++;
                }else if(v1 >= 65 && v1 <= 90 && (c == null || c != c1)){
                    result.add(false);
                    break;
                }

                j++;
                if(sb.toString().equals(pattern) && j == s.length()){
                    result.add(true);
                }else if(!sb.toString().equals(pattern) && j == s.length()){
                    result.add(false);
                }
            }


        }
        return result;

    }

    public static void main(String[] args){
        String[] q = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBaT";
        camelMatch(q, pattern);
    }
}
