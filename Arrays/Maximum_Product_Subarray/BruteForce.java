package Arrays.Maximum_Product_Subarray;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums) {
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                best = Math.max(best, product);
            }
        }
        return best;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 3, -2, 4}));
    }
}
