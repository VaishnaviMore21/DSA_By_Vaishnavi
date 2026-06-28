package Arrays.Longest_Subarray_With_Sum_K;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int k) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int sum = 0;
        int best = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) best = i + 1;
            if (!firstIndex.containsKey(sum)) {
                firstIndex.put(sum, i);
            }
            int needed = sum - k;
            if (firstIndex.containsKey(needed)) {
                best = Math.max(best, i - firstIndex.get(needed));
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
