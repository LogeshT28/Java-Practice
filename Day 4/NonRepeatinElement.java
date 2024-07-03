import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class NonRepeatinElement{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str  = s.next();
        char[] arr = str.toCharArray();
        List<Character> list =  new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            char c = str.charAt(i);
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(i !=j && c ==arr[j]){
                    // list.add(c);
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                list.add(c); 
            }
        }

        for(char num:list){
            System.out.print(num+" ");
        }
    }
}