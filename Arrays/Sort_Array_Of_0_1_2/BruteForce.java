package Arrays.Sort_Array_Of_0_1_2;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{2, 0, 2, 1, 1, 0})));
    }
}
