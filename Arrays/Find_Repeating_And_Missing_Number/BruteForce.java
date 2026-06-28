package Arrays.Find_Repeating_And_Missing_Number;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] nums) {
        int repeating = -1, missing = -1;
        int n = nums.length;

        for (int val = 1; val <= n; val++) {
            int count = 0;
            for (int x : nums) {
                if (x == val) count++;
            }
            if (count == 2) repeating = val;
            else if (count == 0) missing = val;
        }
        return new int[]{repeating, missing};
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, 2, 5, 3})));
    }
}
