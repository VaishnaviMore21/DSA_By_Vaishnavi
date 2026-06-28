package Arrays.Longest_Subarray_With_Given_Sum_K_Positives;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int best = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left++];
            }
            if (sum == k) {
                best = Math.max(best, right - left + 1);
            }
        }
        return best;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
