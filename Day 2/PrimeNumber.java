//package Day 2;
//Write a Java program to print all the prime numbers between 1 and 100.

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);

        int start = 1;
        int end=100;
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
