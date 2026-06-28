package Arrays.Count_Subarrays_With_XOR_K;

import java.util.*;

public class BruteForce {
    public static int solve(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int xr = 0;
            for (int j = i; j < nums.length; j++) {
                xr ^= nums[j];
                if (xr == k) count++;
            }
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 2, 2, 6, 4}, 6));
    }
}
