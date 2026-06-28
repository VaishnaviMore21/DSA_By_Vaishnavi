package Arrays.Move_Zeros_To_End;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        List<Integer> nonZero = new ArrayList<>();
        for (int value : arr) {
            if (value != 0) nonZero.add(value);
        }
        int index = 0;
        for (int value : nonZero) arr[index++] = value;
        while (index < arr.length) arr[index++] = 0;
        return arr[0];
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
