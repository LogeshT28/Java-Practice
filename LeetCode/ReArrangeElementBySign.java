//2149. Rearrange Array Elements by Sign

// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
// Example 2:

// Input: nums = [-1,1]
// Output: [1,-1]
// Explanation:
// 1 is the only positive integer and -1 the only negative integer in nums.
// So nums is rearranged to [1,-1].



public class ReArrangeElementBySign {
    static int[] rearrangeArray(int[] n) {
        int pos[] = new int[n.length / 2];
        int neg[] = new int[n.length / 2];
        int p = 0, ne = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                pos[p++] = n[i];
            } else {
                neg[ne++] = n[i];
            }
        }
        int res[] = new int[n.length];
        int i1 = 0;
        int i2 = 1;
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                res[i] = pos[i - i1];
                i1++;
            } else {
                res[i] = neg[i - i2];
                i2++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Sample test cases
        int[] nums1 = {3, -1, -2, 4, 5, -3};
        int[] rearranged1 = rearrangeArray(nums1);
        for (int num : rearranged1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {1, -1, 2, -2, 3, -3, 4, -4};
        int[] rearranged2 = rearrangeArray(nums2);
        for (int num : rearranged2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3 = {-5, 5, -6, 6, -7, 7};
        int[] rearranged3 = rearrangeArray(nums3);
        for (int num : rearranged3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
