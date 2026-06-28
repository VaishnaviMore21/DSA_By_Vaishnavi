package Arrays.Largest_Subarray_With_Sum_Zero;

import java.util.*;

public class Better {
    public static int solve(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (prefix[j + 1] - prefix[i] == 0) best = Math.max(best, j - i + 1);
            }
        }
        return best;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{15, -2, 2, -8, 1, 7, 10, 23}));
    }
}
