package LeetCode;
import java.util.Scanner;

public class PluesOneArray  {
    public static int[] PluseOne(int [] digits){
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static int[] plusOne(int[] digits) {
        int num = 0;
        for (int n : digits) {
            num = num * 10 + n;
        }
        num = num + 1;
        String str = Integer.toString(num);
        int res[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i) - '0';
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of digits from the user
        System.out.print("Enter the number of digits: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] digits = new int[n];

        // Get the digits from the user
        System.out.println("Enter the digits one by one:");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        // Call the plusOne method
        int[] result = plusOne(digits);

        // Print the result
        System.out.print("Result after adding one: ");
        for (int digit : result) {
            System.out.print(digit);
        }
        System.out.println();

        int[] result1 = PluseOne(digits);

        // Print the result
        System.out.print("Result after adding one: ");
        for (int digit : result1) {
            System.out.print(digit);
        }
        System.out.println();

        scanner.close();
    }
}
