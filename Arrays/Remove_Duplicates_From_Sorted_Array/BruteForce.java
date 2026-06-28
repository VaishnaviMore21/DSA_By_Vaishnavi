package Arrays.Remove_Duplicates_From_Sorted_Array;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int index = 0;
        for (int value : set) {
            arr[index++] = value;
        }
        return index;
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
