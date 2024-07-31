import java.util.HashMap;

public class LengthOfLagestSubArray {

    static int lenOfLongSubarrLinear(int a[],int n,int k){
        int max=0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
              sum +=a[j];
              if(sum==k){
                  max=Math.max(max,j-i+1);
              }
            }
        }
        return max;
    }

    static int lenOfLongSubarr(int a[],int n,int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=a[i];
            if(sum==k){
                max = i+1;
            }
            if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }



        return max;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println("Output: " + lenOfLongSubarr(arr1, arr1.length, k1)); // Output: 4
        System.out.println(lenOfLongSubarrLinear(arr1, arr1.length, k1));
        int[] arr2 = {-1, 2, 3};
        int k2 = 6;
        System.out.println("Output: " + lenOfLongSubarr(arr2, arr2.length, k2)); // Output: 0

        int[] arr3 = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k3 = 15;
        System.out.println("Output: " + lenOfLongSubarr(arr3, arr3.length, k3)); // Output: 5

        // Additional test cases
        int[] arr4 = {1, 2, 3, 7, 5};
        int k4 = 12;
        System.out.println("Output: " + lenOfLongSubarr(arr4, arr4.length, k4)); // Output: 2 (subarray [3, 7, 2])

        int[] arr5 = {1, -1, 5, -2, 3};
        int k5 = 3;
        System.out.println("Output: " + lenOfLongSubarr(arr5, arr5.length, k5)); // Output: 4 (subarray [1, -1, 5, -2])

        int[] arr6 = {-1, -1, -1, 1};
        int k6 = 0;
        System.out.println("Output: " + lenOfLongSubarr(arr6, arr6.length, k6)); // Output: 4 (subarray [-1, -1, -1, 1])
    }

}
