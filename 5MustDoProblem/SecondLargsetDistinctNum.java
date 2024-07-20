import java.util.Arrays;
public class SecondLargsetDistinctNum {
    public static int SecondLargNum(int[] a){
        if(a.length <= 1){
            return -1;
        }
        Arrays.sort(a);
        int first = a[a.length-1];
        int second = a[a.length-2];
        if(first==second){
            return -1;
        }
        return second;
    }
    public static void main(String[] args) {
        int a[]={12, 35, 1, 10, 34, 1};
        int b[]={10, 10};
        int c[] = {25, 45, 25, 35, 45, 55, 60, 55};
        int d[]= {5, 4, 3, 2, 1};
        int e[]={100};
        System.out.println(SecondLargNum(a));
        System.out.println(SecondLargNum(b));
        System.out.println(SecondLargNum(c));
        System.out.println(SecondLargNum(d));
        System.out.println(SecondLargNum(e));
    }
}
