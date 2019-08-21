package Trie;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

    TrieNode root;
    HashMap<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap();
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieNode cur = root;
        cur.score += delta;
        for (char c: key.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
            cur.score += delta;
        }
    }

    public int sum(String prefix) {
        TrieNode cur = root;
        for (char c: prefix.toCharArray()) {
            cur = cur.children.get(c);
            if (cur == null) return 0;
        }
        return cur.score;
    }

    class TrieNode{
        int score;
        Map<Character, TrieNode> children;

        public TrieNode(){
            children = new HashMap<>();
        }
    }
}
