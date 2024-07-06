import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args){
        Scanner s = new  Scanner(System.in);
        String str = s.nextLine();
        char ch = s.next().charAt(0);
        char c = s.next().charAt(0);

        String res = str.replace(ch, c);
        System.out.println(res);

        
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
              str=  str.substring(0, i)+c+str.substring(i+1);
            }
        }
        System.out.println(str);

    }
}
