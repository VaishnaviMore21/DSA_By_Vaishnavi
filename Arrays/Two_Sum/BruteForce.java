package Arrays.Two_Sum;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] nums, int target) {
        // Check every pair.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int[] ans = solve(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ans));
    }
}
