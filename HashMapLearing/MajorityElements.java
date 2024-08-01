// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 



import java.util.*;
import java.util.Map.Entry;

public class MajorityElements {

   static void  MajorityElement(int[] arr){

    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    }
    int length = arr.length/3;
    int element = 0;
    int value =0;

    for(Entry<Integer, Integer> entry: map.entrySet()){
        element = entry.getKey();
        value = entry.getValue();
        if(value > length){
            list.add(element);
        }
    }
    for(int n:list){
        System.out.print(n+" ");
    }
    System.out.println();
}    
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        MajorityElement(nums);
        int[] nums1={1};
        MajorityElement(nums1);
        int[]  nums2={1,2};
        MajorityElement(nums2);
        
    }
}
