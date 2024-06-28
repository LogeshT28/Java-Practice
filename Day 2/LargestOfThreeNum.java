//Write a Java program to find the largest of three numbers using if-else statements.

import java.util.Scanner;

public class LargestOfThreeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a > b && a> c){
            System.out.println("largest Num is :"+a);
        }
        else if(b> a && b > c){
            System.out.println("largest Num is :"+b);
        }
        else{
            System.out.println("largest Num is :"+c);
        }
    }
}
