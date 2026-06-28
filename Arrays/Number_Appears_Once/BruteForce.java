package Arrays.Number_Appears_Once;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count == 1) return arr[i];
        }
        return -1;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
