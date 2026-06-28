package Arrays.Maximum_Consecutive_Ones;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        int best = 0;
        int current = 0;
        for (int value : arr) {
            if (value == 1) {
                current++;
                best = Math.max(best, current);
            } else {
                current = 0;
            }
        }
        return best;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
