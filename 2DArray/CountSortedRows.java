import java.util.Scanner;

public class CountSortedRows {
    public static boolean isSorted(int a[]){
        int column = a.length;
        boolean ase= true;
        boolean des = true;
        for(int i=0;i<column-1;i++){
            if(a[i] > a[i+1]){
                ase = false;
            }
            if(a[i] < a[i+1]){
                des = false;
            }

        }

        return ase || des;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        int res =0;
        for(int i=0;i<n;i++){
            if(isSorted(a[i])){
                res++;
            }
        }
               System.out.println(res); 
    }
}
