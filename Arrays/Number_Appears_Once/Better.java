package Arrays.Number_Appears_Once;

import java.util.*;

public class Better {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }
        for (int value : arr) {
            if (frequency.get(value) == 1) return value;
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
