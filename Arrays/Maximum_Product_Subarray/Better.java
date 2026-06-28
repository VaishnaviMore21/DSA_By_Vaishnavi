package Arrays.Maximum_Product_Subarray;

import java.util.*;

public class Better {
    public static int solve(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1;
        int best = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - 1 - i];

            best = Math.max(best, Math.max(prefix, suffix));
        }
        return best;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 3, -2, 4}));
    }
}
