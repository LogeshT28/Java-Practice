import java.util.Scanner;

public class NthFibanociSeries {
    public static int fibanociSeries(int n){

        if( n <=1 ){
            return n;
        }
        else{
            return fibanociSeries(n-1) + fibanociSeries(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibanociSeries(n));
    }
}
