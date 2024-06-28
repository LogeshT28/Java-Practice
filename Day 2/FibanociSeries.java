//package Day 2;
//Write a Java program to print Fibonacci series up to n terms.

import java.util.Scanner;

public class FibanociSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        int third =0;
        for(int i=3;i<n;i++){
            third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}
