import java.util.Scanner;

public class ArithameticOper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        float c =4.7f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println((int)Math.ceil(c));
        System.out.println((int)Math.floor(c));

    }
}
