package Trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        if(dict.size() == 0){
            return sentence;
        }
        if(sentence == null || sentence.length() == 0){
            return null;
        }
        Trie root = new Trie();
        for(String s : dict){
            root.addRoot(s);
        }

        String[] sp = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sp.length; i++){
            String s = root.findWord(sp[i]);
            if(s != null){
                sp[i] = s;
            }
            sb.append(sp[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }

    class Trie{
        TrieNode root = null;

        public Trie(){
            root = new TrieNode();
        }
        public void addRoot(String word){
            int i = 0;

            TrieNode node = root;
            while(i < word.length()){
                char c = word.charAt(i);

                if(node.children.get(c) == null){
                    node.children.put(c, new TrieNode());
                }
                node = node.children.get(c);
                i++;
            }
            node.isEnd = true;
        }



        public String findWord(String word){
            TrieNode node = root;

            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(i < word.length()){
                char c = word.charAt(i);
                TrieNode n = node.children.get(c);
                if(n == null){
                    return null;
                }
                sb.append(c);
                if(n.isEnd != null && n.isEnd){
                    break;
                }
                node = n;
                i++;

            }

            return sb.toString();
        }

    }


    class TrieNode{
        Boolean isEnd;
        Map<Character, TrieNode> children;

        public TrieNode(){
            children = new HashMap<>();
        }
    }
}
