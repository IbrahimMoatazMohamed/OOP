package Week6.HashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
public class Dictionary {
    HashMap<String, String> words = new HashMap<>();
    public void add(String word, String translation){
        words.put(word, translation);
    }
    public String translate(String word){
        return words.containsKey(word) ? words.get(word) : null;
    }
    public int amountOfWords(){
        return words.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> result = new ArrayList<>();
        for(String key : words.keySet()){
            result.add(key
                    .concat(" = ")
                    .concat(words.get(key))
            );
        }
        return result;
    }
}
