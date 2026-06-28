package Arrays.Left_Rotate_Array_By_One;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        if (arr.length == 0) return 0;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return arr[0];
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
