//package Day 2;
//Write a Java program to find the sum of the first n natural numbers using a while loop.

import java.util.Scanner;

public class SumOfNaturalNUmUsingWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int end = s.nextInt();
        int sum=0;
        int i=1;
        while(i<=end){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
