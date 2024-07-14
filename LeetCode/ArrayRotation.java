import java.util.Scanner;

class ArrayRotation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();


        for (int i = 0; i < k; i++) {
            int temp = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        

        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}