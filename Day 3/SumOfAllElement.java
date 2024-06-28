//package Day 3;
//Write a Java program to find the sum of all elements in an array.

import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
