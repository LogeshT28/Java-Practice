import java.util.*;
class StudentAttendanceRecord{
    public static void MoveZeroToEnd(int a[]){
        int res[] = new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                res[j++]=a[i];
            }
        }
        while (j<a.length) {
            res[j++]=0;
        }
        for(int n:res){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
         int a[] = {0,101,0,203,304};
        // for(int i=0;i<n;i++){
        //     a[i]=s.nextInt();
        // }
        int b[]={0};
        int c[]={501, 0, 0, 102, 305, 0, 204};
        int d[] ={0, 0, 0, 0, 1};
        int e[]={2, 0, 4, 0, 5, 0, 7, 0};
        MoveZeroToEnd(a);
        MoveZeroToEnd(b);
        MoveZeroToEnd(c);
        MoveZeroToEnd(d);
        MoveZeroToEnd(e);
    }
}