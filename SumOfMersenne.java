// Sum of all numbers present in an array arr[],the task is 
// nd to sum of all the mersenne numbers from the array. A number is a mersenne number
//  if it is greater than 0 and is one less than some power of 2.
//  first two mersenne numbers are 137 15 3160 3 137

public class SumOfMersenne {
    // public static boolean fun(int arr[],int k){
    //     for(int i=0;i<arr.length;i++){
    //         int sum =arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             sum +=arr[j];
    //             if(sum==k){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static void fun(int arr[]){
        int sum = 0;
        for(int i=0;i<50;i++){
            int temp = (int) (Math.pow(2,i)-1);

            for(int j=0;j<arr.length;j++){
                if(arr[j]==temp){
                    sum +=temp;
                }
            }
        }
        System.out.println(" "+sum+"  ");

    }
    public static void main(String[] args) {
        int arr[] = {17,6,7,63,3};
        int arr1[] = {1,3,11,45};
        int arr2[]={17,6,7,63,3};
       fun(arr);
       fun(arr1);
       fun(arr2);

    }
}
