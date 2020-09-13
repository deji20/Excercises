package collectionExercises;

import java.util.*;

public class CollectionExercises {
    
    public int totalVowels(List<String> words){
        int total = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        for(String word: words){
            for(String vowel: vowels){
                if(word.toLowerCase().contains(vowel)){
                    total++;
                }
            }
        }
        return total;
    }
    public int countUnique(List<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for(Integer i: list){
            set.add(i);
        }
        return set.size();
    }
    public int minLength(Set<String> wordSet){
        String shortest = "";
        for(String word: wordSet){
            if(shortest.isEmpty() || shortest.length() > word.length()){
                shortest = word;
            }
        }
        return shortest.length();
    }
    public Set<String> removeOddLength(Set<String> wordSet){
        Set<String> result = new HashSet<>();
        for(String word: wordSet){
            if(word.length() % 2 == 0){
                result.add(word);
            }
        }
        return result;
    }
    public  boolean count3(List<String> wordSet){
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: wordSet){
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word)+1);
            if(map.get(word) == 3){
                return true;
            }
        }
        return false;
    }
    public boolean isUnique(Map<String, String> map){
        HashMap<String, Integer> count = new HashMap<>();
        for(Map.Entry<String, String> entry: map.entrySet()){
            String value = entry.getValue();
            count.putIfAbsent(value, 0);
            count.put(value, count.get(value) + 1);
            if(count.get(value) == 2){
                return false;
            }
        }
        return true;
    }
}
