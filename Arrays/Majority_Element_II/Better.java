package Arrays.Majority_Element_II;

import java.util.*;

public class Better {
    public static List<Integer> solve(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;

        for (int value : nums) {
            int count = freq.getOrDefault(value, 0) + 1;
            freq.put(value, count);
            if (count == threshold + 1) {
                result.add(value);
            }
        }
        return result;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 2, 3, 2, 2, 1, 1}));
    }
}
