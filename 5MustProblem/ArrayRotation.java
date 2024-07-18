public class ArrayRotation {

    public static void RotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the length of the array

        // Reverse the whole array
        reverse(arr, 0, n - 1);
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining elements
        reverse(arr, k, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[]={-1, -100, 3, 99};
    int c[] ={10, 20, 30, 40, 50};
    int d[]={5,6,7};
    int e[]= {15, 25, 35, 45};
        RotateArray(a, 3);
        RotateArray(b, 2);
        RotateArray(c, 1);
        RotateArray(d, 0);
        RotateArray(e, 6);
    }
}
