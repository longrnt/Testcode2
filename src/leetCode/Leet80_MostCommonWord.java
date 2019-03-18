package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Leet80_MostCommonWord {
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = new String[]{"hit"};
		mostCommonWord(paragraph, banned);
		
	}
	
    public static String mostCommonWord(String paragraph, String[] banned) {
    	String result = null;
    	Trie trie = new Trie();
    	String[] words = paragraph.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");
    	
    	for (int i = 0; i < words.length; ++i) {
    		trie.insert(words[i]);
    	}
    	
    	
    	return result;
    }
}

class TrieNode {
    TrieNode[] arr;
    boolean isEnd;
    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }
 
}
 
class Trie {
    private TrieNode root;
 
    public Trie() {
        root = new TrieNode();
    }
 
    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.isEnd=true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }
 
        return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
}