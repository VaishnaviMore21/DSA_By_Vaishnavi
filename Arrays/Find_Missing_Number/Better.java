package Arrays.Find_Missing_Number;

import java.util.*;

public class Better {
    // Logic implementation
    public static int solve(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];
        for (int value : arr) {
            present[value] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) return i;
        }
        return -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
