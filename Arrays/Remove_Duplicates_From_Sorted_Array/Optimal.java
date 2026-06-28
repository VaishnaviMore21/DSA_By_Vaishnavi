package Arrays.Remove_Duplicates_From_Sorted_Array;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        if (arr.length == 0) return 0;
        int write = 1;
        for (int read = 1; read < arr.length; read++) {
            if (arr[read] != arr[read - 1]) {
                arr[write++] = arr[read];
            }
        }
        return write;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
