public class IncreasingTripletes {

    public static boolean increasingTripletSequence(int[] nums){
        int n=nums.length;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] < nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[j]<nums[k]){
                            flag = true;}}}}}
            if(flag){
                return true;
            }
            return false;
    }
    public static boolean increasingTripletSequ(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n:nums){
            if(n <= first){
                first = n;
            }
            else if(n <= second){
                second = n;
            }
            else{
                return true;
            }
        }
        return false;
        }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(increasingTripletSequence(a));
        System.out.println(increasingTripletSequ(a));
    }
}
