package LeetCode;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram{
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Map<Character , Integer > a = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(a.containsKey(c)){
                int t1 = a.get(c);
                a.put(c,t1+1);
            }
            else
                a.put(c,1);
        }
        System.out.print(a);
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(a.containsKey(c)){
                int t1 = a.get(c);
                a.put(c,t1-1);
            }
            else   
                break;
        }
        for(Map.Entry<Character , Integer > num : a.entrySet()){
            if(num.getValue()==0){
                continue;
            }
            else{
                System.out.println("False");
            }
        }
    }
}