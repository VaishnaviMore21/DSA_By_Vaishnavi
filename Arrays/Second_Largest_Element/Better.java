package Arrays.Second_Largest_Element;

import java.util.*;

public class Better {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        int largest = Integer.MIN_VALUE;
        for (int value : arr) {
            largest = Math.max(largest, value);
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value != largest) {
                secondLargest = Math.max(secondLargest, value);
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    // Time Complexity: O(2n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
