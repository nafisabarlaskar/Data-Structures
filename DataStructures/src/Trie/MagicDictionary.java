package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicDictionary {

    Map<Integer, List<String>> map;
    /** Initialize your data structure here. */
    public MagicDictionary() {
        map = new HashMap<>();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String s : dict){
            List<String> list = map.get(s.length());
            if(list == null){
                list = new ArrayList<String>();
            }
            list.add(s);
            map.put(s.length(), list);
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {

        List<String> list = map.get(word.length());
        if(!map.containsKey(word.length()))return false;
        for(String s : list){
            int mismatch = 0;
            for (int i = 0; i < word.length(); ++i) {
                if (word.charAt(i) != s.charAt(i)) {
                    if (++mismatch > 1) break;
                }
            }
            if (mismatch == 1) return true;
        }
        return false;
    }
}
