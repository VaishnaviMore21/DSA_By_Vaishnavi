package Arrays.Largest_Subarray_With_Sum_Zero;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int prefix = 0, best = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (prefix == 0) best = i + 1;
            if (firstIndex.containsKey(prefix)) {
                best = Math.max(best, i - firstIndex.get(prefix));
            } else {
                firstIndex.put(prefix, i);
            }
        }
        return best;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{15, -2, 2, -8, 1, 7, 10, 23}));
    }
}
