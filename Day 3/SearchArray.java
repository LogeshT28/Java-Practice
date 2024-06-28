import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k = s.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
           
        }
    }
}
