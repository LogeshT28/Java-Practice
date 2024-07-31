// 560. Subarray Sum Equals K

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.
// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2

import java.util.HashMap;

public class SubArrayEqualsWithK {

    public static int subarraySum(int[] nums, int k) {
        //int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

//optimized code ;
    // HashMap<Integer, Integer> map = new HashMap<>();
    //     int sum = 0; // Initialize the cumulative sum
    //     int count = 0; // Initialize the count of subarrays

    //     // Add initial cumulative sum (0) with frequency 1 to handle cases where sum == k
    //     map.put(0, 1);

    //     // Traverse through the given array
    //     for (int num : nums) {
    //         sum += num; // Add the current element to the cumulative sum

    //         // Check if (sum - k) exists in the map
    //         if (map.containsKey(sum - k)) {
    //             count += map.get(sum - k); // Increment count by the frequency of (sum - k)
    //         }

    //         // Add the current cumulative sum to the map with its frequency
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);
    //     }

    //     return count; // Return the count of subarrays
    
    public static void main(String[] args) {
        int arr1[] = {1,1,1};
        int k1=2;
        int arr2[] = {1,2,3};
        int k2=3;

        System.out.println(subarraySum(arr1,k1));//output 2
        System.out.println(subarraySum(arr2,k2));//output 2
    }
}
