package Arrays.Majority_Element_I;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums) {
        // Boyer-Moore Voting Algorithm.
        int candidate = 0;
        int count = 0;
        for (int value : nums) {
            if (count == 0) {
                candidate = value;
            }
            count += (value == candidate) ? 1 : -1;
        }

        // Verification step for safety.
        int freq = 0;
        for (int value : nums) {
            if (value == candidate) freq++;
        }
        return freq > nums.length / 2 ? candidate : -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
