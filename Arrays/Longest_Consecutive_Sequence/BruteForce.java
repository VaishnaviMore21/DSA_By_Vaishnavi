package Arrays.Longest_Consecutive_Sequence;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;

        int best = 1, current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] == nums[i - 1] + 1) current++;
            else current = 1;
            best = Math.max(best, current);
        }
        return best;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
