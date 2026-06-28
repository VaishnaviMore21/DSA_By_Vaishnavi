package Arrays.Union_Of_Two_Sorted_Arrays;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static String solve(int[] arr, int ignored) {
        int[] a = {1,2,2,3,4};
        int[] b = {2,3,5};
        TreeSet<Integer> set = new TreeSet<>();
        for (int value : a) set.add(value);
        for (int value : b) set.add(value);
        return set.toString();
    }

    // Time Complexity: O((n+m) log(n+m))
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
