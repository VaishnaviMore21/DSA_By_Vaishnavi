package Arrays.Majority_Element_I;

import java.util.*;

public class Better {
    public static int solve(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int threshold = nums.length / 2;
        for (int value : nums) {
            int count = freq.getOrDefault(value, 0) + 1;
            if (count > threshold) return value;
            freq.put(value, count);
        }
        return -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
