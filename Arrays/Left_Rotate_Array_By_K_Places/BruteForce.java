package Arrays.Left_Rotate_Array_By_K_Places;

import java.util.*;

public class BruteForce {
    // Logic implementation
    public static int solve(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return 0;
        k %= n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }
        System.arraycopy(temp, 0, arr, 0, n);
        return arr[0];
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
