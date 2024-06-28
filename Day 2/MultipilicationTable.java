//package Day 2;
//Write a Java program to print the multiplication table of a given number using a for loop.
import java.util.*;

public class MultipilicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i+" * x  "+n+" = "+i*n);
        }
    }
}
