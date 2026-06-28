package Arrays.Number_Appears_Once;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        int xor = 0;
        for (int value : arr) xor ^= value;
        return xor;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
