package Arrays.Union_Of_Two_Sorted_Arrays;

import java.util.*;

public class Better {
    // Logic implementation
    public static String solve(int[] arr, int ignored) {
        int[] a = {1,2,2,3,4};
        int[] b = {2,3,5};
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < a.length && j < b.length) {
            int value;
            if (a[i] <= b[j]) {
                value = a[i++];
            } else {
                value = b[j++];
            }
            if (union.isEmpty() || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }
        while (i < a.length) {
            int value = a[i++];
            if (union.isEmpty() || union.get(union.size() - 1) != value) union.add(value);
        }
        while (j < b.length) {
            int value = b[j++];
            if (union.isEmpty() || union.get(union.size() - 1) != value) union.add(value);
        }
        return union.toString();
    }

    // Time Complexity: O(n+m)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
