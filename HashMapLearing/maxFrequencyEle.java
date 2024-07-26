// You are given an array nums consisting of positive integers.

// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

// The frequency of an element is the number of occurrences of that element in the array.

 

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.
// Example 2:

// Input: nums = [1,2,3,4,5]
// Output: 5
// Explanation: All elements of the array have a frequency of 1 which is the maximum.
// So the number of elements in the array with maximum frequency is 5.

import java.util.HashMap;

public class maxFrequencyEle {
    public static void printingHashMap(String[] nums){
        HashMap<String,Integer> map = new HashMap<>();
        for(String i:nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        // for (String i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        for(HashMap.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());

        }
    }
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int max=0;
        int res=0;
        for(int i:map.values()){
            max = Math.max(i,max);
            if(max == i){
                res+=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 2, 3, 1, 1, 4, 4, 4, 4};
        String[] nums1 = {"apple", "banana", "apple", "orange", "banana", "apple"};

    
        int result = maxFrequencyElements(nums);
        System.out.println("The sum of the maximum frequency elements is: " + result);

        printingHashMap(nums1);
    }
}
