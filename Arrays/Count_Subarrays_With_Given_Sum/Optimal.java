package Arrays.Count_Subarrays_With_Given_Sum;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums, int k) {
        Map<Integer, Integer> prefixFreq = new HashMap<>();
        prefixFreq.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int value : nums) {
            prefix += value;
            int needed = prefix - k;
            count += prefixFreq.getOrDefault(needed, 0);
            prefixFreq.put(prefix, prefixFreq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 1}, 2));
    }
}
