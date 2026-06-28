package Arrays.Rearrange_Array_By_Sign;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int value : nums) {
            if (value >= 0) pos.add(value);
            else neg.add(value);
        }

        int[] out = new int[nums.length];
        int i = 0, p = 0, n = 0;
        while (i < nums.length) {
            out[i++] = pos.get(p++);
            if (i < nums.length) out[i++] = neg.get(n++);
        }
        return out;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, -2, -5, 2, -4})));
    }
}
