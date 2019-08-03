package Trie;
import java.util.*;

public class Trie {
    String word;
    Map<Character, Trie> nodeMap;

    public Trie(){
        nodeMap = new HashMap<>();
    }
}
