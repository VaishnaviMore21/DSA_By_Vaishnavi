package Arrays.Rearrange_Array_By_Sign;

import java.util.*;

public class Better {
    public static int[] solve(int[] nums) {
        // Same complexity profile as brute for this constrained version.
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int value : nums) {
            if (value >= 0) pos.add(value);
            else neg.add(value);
        }

        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length / 2; i++) {
            out[2 * i] = pos.get(i);
            out[2 * i + 1] = neg.get(i);
        }
        return out;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, -2, -5, 2, -4})));
    }
}
