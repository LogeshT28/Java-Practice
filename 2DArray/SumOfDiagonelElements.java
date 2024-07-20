import java.util.Scanner;

public class SumOfDiagonelElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
     int a[][] = new int[n][m];
     int sum=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=s.nextInt();
            if(i==j){
                sum+=a[i][j];
            }
        }
    }
    System.out.println(sum);
    }
    
}
