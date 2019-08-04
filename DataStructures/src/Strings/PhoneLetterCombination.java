package Strings;

import java.lang.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombination {
        Map<Integer, String> map = new HashMap<>();

        public void createMap(){
            map.put(2, "abc");
            map.put(3, "def");
            map.put(4, "ghi");
            map.put(5, "jkl");
            map.put(6, "mno");
            map.put(7, "pqrs");
            map.put(8, "tuv");
            map.put(9, "wxyz");
            map.put(0, "");
        }

        public void createCombination(String num, List<String> result, StringBuilder sb){
            if(num.length() == 0){
                result.add(sb.toString());
                return;
            }
            String val = map.get(num.charAt(0) - '0');
            for(int i = 0; i < val.length(); i++){
                sb.append(val.charAt(i));
                createCombination(num.substring(1), result, sb);
                sb.deleteCharAt(sb.length() - 1);
            }

        }

}
