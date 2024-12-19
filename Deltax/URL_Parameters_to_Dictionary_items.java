package Deltax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class URL_Parameters_to_Dictionary_items{

    public static Map<String, List<String>> convertToDictionary(String str){
        Map<String, List<String>> map = new HashMap<>();
        
        String pairs[] = str.split("&");
        for(String pair: pairs){
            String keyvalue[] = pair.split("=",2);
            String key = keyvalue[0];
            String value = keyvalue.length > 1? keyvalue[1] :""; 

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(value);
        }

        return map;

    }
    public static void main(String[] args){
        String testStr1 = "gfg=4&is=5&is=8";
        String testStr2 = "gfg=4";

        System.out.println(convertToDictionary(testStr1));
        System.out.println(convertToDictionary(testStr2));
    }
}