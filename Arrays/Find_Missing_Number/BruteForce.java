package Arrays.Find_Missing_Number;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int n) {
        for (int candidate = 1; candidate <= n; candidate++) {
            boolean found = false;
            for (int value : arr) {
                if (value == candidate) {
                    found = true;
                    break;
                }
            }
            if (!found) return candidate;
        }
        return -1;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
