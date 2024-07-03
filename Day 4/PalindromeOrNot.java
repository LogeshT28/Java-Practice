import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
             rev += str.charAt(i); 
        }
        if(str.equals(rev)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
