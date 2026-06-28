package Arrays.Maximum_Subarray_Print;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] nums) {
        int best = Integer.MIN_VALUE, left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
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
    // Space Complexity: O(n) for output slice
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})));
    }
}
