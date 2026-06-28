package Arrays.Find_Missing_Number;

import java.util.*;

public class Optimal {
    // Logic implementation
    public static int solve(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 1; i <= n; i++) xor1 ^= i;
        for (int value : arr) xor2 ^= value;
        return xor1 ^ xor2;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
