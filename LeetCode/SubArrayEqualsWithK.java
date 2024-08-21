// 560. Subarray Sum Equals K

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.
// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2


public class SubArrayEqualsWithK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 1, 1};
        int k1 = 2;
        System.out.println("Output for arr1: " + subarraySum(arr1, k1)); // Expected: 2

        int arr2[] = {1, 2, 3};
        int k2 = 3;
        System.out.println("Output for arr2: " + subarraySum(arr2, k2)); // Expected: 2

        int arr3[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k3 = 7;
        System.out.println("Output for arr3: " + subarraySum(arr3, k3)); // Expected: 3

        int arr4[] = {1, 2, 3, 4, 5};
        int k4 = 5;
        System.out.println("Output for arr4: " + subarraySum(arr4, k4)); // Expected: 2

        int arr5[] = {-1, -1, 1, 1};
        int k5 = 0;
        System.out.println("Output for arr5: " + subarraySum(arr5, k5)); // Expected: 3
    }
}

