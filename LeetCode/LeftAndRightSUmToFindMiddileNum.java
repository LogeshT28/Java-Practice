import java.util.Scanner;
public class LeftAndRightSUmToFindMiddileNum {
    public static int findMiddleIndex(int a[]){
        int totalsum=0;
        for(int i=0;i<a.length;i++){
            totalsum+=a[i];
        }
            int leftsum=0;
            int rightsum=0;
            for(int i=0;i<a.length;i++){
                rightsum =totalsum-leftsum-a[i];
                if(rightsum==leftsum){
                    return i;
                }
                leftsum+=a[i];
            }
            return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] testCase1 = {2, 3, -1, 8, 4};
        int[] testCase2 = {1, -1, 4};
        int[] testCase3 = {2, 5};
        int[] testCase4 = {1, 7, 3, 6, 5, 6};
        int[] testCase5 = {1, 2, 3};
        int[] testCase6 = {2, 3, -1, 8, 4, 5};

        System.out.println("Test Case 1: " + findMiddleIndex(testCase1)); // Expected output: 3
        System.out.println("Test Case 2: " + findMiddleIndex(testCase2)); // Expected output: 2
        System.out.println("Test Case 3: " + findMiddleIndex(testCase3)); // Expected output: -1
        System.out.println("Test Case 4: " + findMiddleIndex(testCase4)); // Expected output: 3
        System.out.println("Test Case 5: " + findMiddleIndex(testCase5)); // Expected output: -1
        System.out.println("Test Case 6: " + findMiddleIndex(testCase6)); // Expected output: -1
    }
}
