import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextInt();
        }
        int sum=0;
        for(int i=0;i<N-1;i++){
            sum +=arr[i];
        }
        
        int expectedsum = (N*(N+1))/2;
        System.out.println(expectedsum-sum);
    }
}
