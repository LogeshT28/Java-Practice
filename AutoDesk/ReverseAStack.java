import java.util.Scanner;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i:arr){
            stack.push(i);
        }
        
        Stack<Integer> res = new Stack<>();
        for(int i=0;i<n;i++){
            if(!stack.isEmpty()){
                int temp = stack.pop();
                res.push(temp);
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
