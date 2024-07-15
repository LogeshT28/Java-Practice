
// Unique Number of Occurrences
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwis
// Example 1:
// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:
// Input: arr = [1,2]
// Output: false
// Example 3:

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class UniqueNumberOfOccurance {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each value in the array
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Use a set to check for unique occurrences
        Set<Integer> s = new HashSet<>();
        for (int num : map.values()) {
            if (!s.add(num)) {
                return false; // If add returns false, it means the count is not unique
            }
        }

        return true; // All occurrences are unique
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = uniqueOccurrences(arr);

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
