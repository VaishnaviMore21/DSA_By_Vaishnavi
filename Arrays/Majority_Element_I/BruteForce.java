package Arrays.Majority_Element_I;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int value : nums) {
                if (value == nums[i]) count++;
            }
            if (count > n / 2) return nums[i];
        }
        return -1;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
