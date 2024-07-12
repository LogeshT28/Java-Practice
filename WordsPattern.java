

import java.util.HashMap;
import java.util.Map;
class WordsPattern {
    public static boolean wordPatt(String p,String s){

        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        String words[] = s.split(" ");
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            String word = words[i];
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(word)){
                    return false;
                }
            }
            else{
                if(map2.containsKey(word)){
                    return false;
                }
                map1.put(c, word);
                map2.put(word, c);
            }

            
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPatt(pattern, s)); // Output: true

        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(wordPatt(pattern, s)); // Output: false

        pattern = "aaaa";
        s = "dog cat cat dog";
        System.out.println(wordPatt(pattern, s)); // Output: false

        pattern = "abba";
        s = "dog dog dog dog";
        System.out.println(wordPatt(pattern, s)); // Output: false
    }
}
