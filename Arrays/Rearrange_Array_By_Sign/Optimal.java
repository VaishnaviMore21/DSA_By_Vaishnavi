package Arrays.Rearrange_Array_By_Sign;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] nums) {
        int[] out = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        // Place positives at even indexes, negatives at odd indexes.
        for (int value : nums) {
            if (value >= 0) {
                out[posIndex] = value;
                posIndex += 2;
            } else {
                out[negIndex] = value;
                negIndex += 2;
            }
        }
        return out;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, -2, -5, 2, -4})));
    }
}
