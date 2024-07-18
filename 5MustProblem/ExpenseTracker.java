public class ExpenseTracker {
    public static void FindTarget(int a[], int k) {
        boolean found = false; // Flag to check if any pair is found
        for (int i = 1; i < a.length; i++) {
            if (a[i] + a[i - 1] == k) {
                System.out.print((i - 1) + " " + i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("No pairs found");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int b[] = {3, 2, 4};
        int c[] = {3, 3};
        int d[] = {1, 5, 7, 2, 8};
        int e[] = {0, 4, 3, 0};
        FindTarget(a, 9);  // Expected output: 0 1 
        FindTarget(b, 6);  // Expected output: 1 2 
        FindTarget(c, 6);  // Expected output: 0 1 
        FindTarget(d, 9);  // Expected output: 0 4 
        FindTarget(e, 0);  // Expected output: 0 3 
    }
}
