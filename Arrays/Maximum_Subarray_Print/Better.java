package Arrays.Maximum_Subarray_Print;

import java.util.*;

public class Better {
    public static int[] solve(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int best = Integer.MIN_VALUE, left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = prefix[j + 1] - prefix[i];
                if (sum > best) {
                    best = sum;
                    left = i;
                    right = j;
                }
            }
        }
        return Arrays.copyOfRange(nums, left, right + 1);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})));
    }
}
