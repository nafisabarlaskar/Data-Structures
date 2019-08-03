package Trie;
import java.lang.*;
import java.util.List;

public class TrieNode {
    Trie root;
    public TrieNode(){
        root = new Trie();
    }

    public void addNode(String str){
        Trie node = root;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(node.nodeMap.get(c) == null){
                node.nodeMap.put(c, new Trie());
            }
            node = node.nodeMap.get(c);
        }
        node.word = str;
    }

    public boolean searchWord(String word){
        Trie node = root;
        if(word.isBlank() || word.isEmpty()){
            return false;
        }

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.nodeMap.get(c) == null){
                return false;
            }
            node = node.nodeMap.get(c);
        }
        return word.equals(node.word);
    }

    public void searchWordInBoard(char[][] board, int i, int j, List<String> result, Trie node){
        char c = board[i][j];
        if( c == '#' || node.nodeMap.get(c) == null){
            return;
        }
        node = node.nodeMap.get(c);
        if(node.word != null || !node.word.isBlank()){
            result.add(node.word);
            return;
        }

        board[i][j] = '#';
        searchWordInBoard(board, i, j-1, result, node);
        searchWordInBoard(board, i-1, j, result, node);
        searchWordInBoard(board, i+1, j, result, node);
        searchWordInBoard(board, i, j+1, result, node);
        board[i][j] = c;
    }
}
