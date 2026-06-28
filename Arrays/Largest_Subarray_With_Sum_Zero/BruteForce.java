package Arrays.Largest_Subarray_With_Sum_Zero;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums) {
        int best = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) best = Math.max(best, j - i + 1);
            }
        }
        return best;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{15, -2, 2, -8, 1, 7, 10, 23}));
    }
}
