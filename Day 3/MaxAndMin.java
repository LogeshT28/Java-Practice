//package Day 3;
//Write a Java program to find the maximum and minimum elements in an array.

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] > max){
                max=a[i];
            }
            if(a[i]< min){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
