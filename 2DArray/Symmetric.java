import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        
        if(n==m){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=s.nextInt();
                }
            }
        }
        else{
            System.out.println("Not Symmetric");
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==a[j][i]){
                    continue;
                }
                else{
                    temp=1;
                    break;
                }
            }
            if (temp==1) {
                break;
            }
        }

        if(temp==1){
            System.out.println("Not Symmetric");
        }
        else{
            System.out.println("Symmetric");
        }
    }
}
