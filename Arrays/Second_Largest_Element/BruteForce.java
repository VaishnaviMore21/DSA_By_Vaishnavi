package Arrays.Second_Largest_Element;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int largest = copy[copy.length - 1];
        for (int i = copy.length - 2; i >= 0; i--) {
            if (copy[i] != largest) {
                return copy[i];
            }
        }
        return -1;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
