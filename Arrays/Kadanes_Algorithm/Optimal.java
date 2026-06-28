package Arrays.Kadanes_Algorithm;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend previous subarray or start fresh.
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
