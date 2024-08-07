import java.util.*;
public class FactorialUseRecursion {
    public static  int Factorial(int n){
        if(n==1){
            return n;
        }
        return n* Factorial(n-1);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // System.out.println(Factorial(n));


        int itr,term1,term2,term3;
        term1=-1;
        term2=1;
        for(itr =1;itr<=n;itr++){
            term3 = term1+term2;
            System.out.print(term3+" ");
            term1= term3;


        }

    }
}
