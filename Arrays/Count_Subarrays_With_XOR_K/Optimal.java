package Arrays.Count_Subarrays_With_XOR_K;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int xr = 0;
        int count = 0;
        for (int value : nums) {
            xr ^= value;
            int need = xr ^ k;
            count += freq.getOrDefault(need, 0);
            freq.put(xr, freq.getOrDefault(xr, 0) + 1);
        }
        return count;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 2, 2, 6, 4}, 6));
    }
}
