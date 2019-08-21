package Strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> result = new LinkedList<>();
        for(String s : words){
            if(s.length() != pattern.length()){
                continue;
            }
            Map<Character, Character> map = new HashMap<>();
            int count = 0;
            for(int i = 0; i < pattern.length(); i++){
                char c = s.charAt(i);
                char p = pattern.charAt(i);
                if(map.get(p) == null){
                    if(map.containsValue(c)){
                        break;
                    }
                    map.put(p, c);
                    count++;
                }else if(map.get(p) != c){
                    break;
                }else{
                    count++;
                }
            }
            if(count == pattern.length()){
                result.add(s);
            }

        }
        return result;
    }
}
