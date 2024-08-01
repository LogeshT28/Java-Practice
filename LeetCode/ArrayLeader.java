
import java.util.ArrayList;
import java.util.Collections;

class ArrayLeader {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 0) return list;

        int max = arr[n - 1];
        list.add(max);
        
        // Traverse the array from the end to the start
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) { // Changed condition to handle duplicate leaders
                max = arr[i];
                list.add(max);
            }
        }
        
        // Reverse the list to get the leaders in the correct order
        Collections.reverse(list);
        
        return list;
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr = {9489, 8245, 6980, 7076, 1396, 8163, 2524, 6553, 2644, 2690, 5714, 471, 360, 4953, 5789, 2197, 9790, 9883, 6448, 1809, 8883, 8285, 8747, 2204, 1957, 4775, 1588, 1362, 8930, 3273, 1822, 4855, 1388, 5653, 2323, 4205, 1387, 9578, 7299, 219};
        ArrayList<Integer> leaders = leaders(arr.length, arr);
        System.out.println(leaders);  // Example output
    }
}

