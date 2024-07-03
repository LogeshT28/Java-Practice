

import java.util.Scanner;

public class VowelsOrConsents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int vowelcount=0;
        int concentcount=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {      
                vowelcount++;
              }
              else{
                concentcount++;
              }
    }
    System.out.println("VOWEL Count : "+vowelcount);
    System.out.println("CONCENT Count : "+concentcount);
}
}
