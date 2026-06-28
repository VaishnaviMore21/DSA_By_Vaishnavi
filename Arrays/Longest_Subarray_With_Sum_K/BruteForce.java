package Arrays.Longest_Subarray_With_Sum_K;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int k) {
        int best = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    best = Math.max(best, j - i + 1);
                }
            }
        }
        return best;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
