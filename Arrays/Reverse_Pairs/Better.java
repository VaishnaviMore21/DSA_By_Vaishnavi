package Arrays.Reverse_Pairs;

import java.util.*;

public class Better {
    public static int solve(int[] nums) {
        // For this problem, there is no widely used distinct "better" between O(n^2) and merge-sort O(n log n).
        // Keeping brute-equivalent implementation intentionally.
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((long) nums[i] > 2L * nums[j]) count++;
            }
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 2, 3, 1}));
    }
}
