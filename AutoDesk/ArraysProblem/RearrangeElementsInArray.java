package ArraysProblem;
import java.util.*;
class RearrangeElementsInArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
    
        int start = 0;
        int end = n-1;
        int res[] = new int[n];
        int i=0;
        while(start<= end){ //0< 4 1 <4 
            if(i%2==0){//0                  //i=0 1%2
                res[i++] = arr[start++]; //res[0] = arr[0] start=0;
            }
            else{
                res[i++] = arr[end--];
            }
            }

        for(int k:res){
            System.out.print(k+" ");
        }
    }
}
