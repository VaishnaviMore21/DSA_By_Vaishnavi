package Arrays.Check_if_Array_is_Sorted;

import java.util.*;

public class Better {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return 0;
            }
        }
        return 1;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
