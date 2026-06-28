package Arrays.Kadanes_Algorithm;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums) {
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                best = Math.max(best, sum);
            }
        }
        return best;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
