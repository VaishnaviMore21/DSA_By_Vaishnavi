package Arrays.Majority_Element_II;

import java.util.*;

public class BruteForce {
    public static List<Integer> solve(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int value : nums) {
                if (value == nums[i]) count++;
            }
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1) excluding output
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 2, 3, 2, 2, 1, 1}));
    }
}
