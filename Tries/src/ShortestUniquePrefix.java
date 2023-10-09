//https://www.scaler.com/academy/mentee-dashboard/class/40044/assignment/problems/277?navref=cl_tt_lst_nm

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShortestUniquePrefix {
    public class Trie{
        HashMap<Character, Trie> charTrieMap;
        boolean endOfWord;
        int count;

        public Trie(){
            count = 0;
            charTrieMap = new HashMap<>();
            endOfWord = false;
        }

    }

    public void insertWord(Trie root, String word){
        Trie currentTrie = root;

        for(Character c : word.toCharArray()){

            if(!currentTrie.charTrieMap.containsKey(c)){
                Trie tempTrie = new Trie();
                currentTrie.charTrieMap.put(c, tempTrie);
                currentTrie = currentTrie.charTrieMap.get(c);
            }
            else{
                currentTrie = currentTrie.charTrieMap.get(c);
            }

            currentTrie.count++;
        }

        currentTrie.endOfWord = true;
    }

    public void searchSmallestPrefix(Trie root, String word, ArrayList<String> ans){

        Trie currentTire = root;
        StringBuilder currentWord = new StringBuilder();

        for(Character c : word.toCharArray()){
            if(currentTire.charTrieMap.containsKey(c)){
                if(currentTire.count == 1){
                    break;
                }
                else{
                    currentWord.append(c);
                }
            }

            currentTire = currentTire.charTrieMap.get(c);
        }
        ans.add(currentWord.toString());
    }

    public ArrayList<String> prefix(ArrayList<String> A) {
        ArrayList<String> ans = new ArrayList<>();
        Trie root = new Trie();

        for(String word : A){
            insertWord(root, word);
        }

        for(String word : A){
            searchSmallestPrefix(root, word, ans);
        }

        return ans;
    }
}
