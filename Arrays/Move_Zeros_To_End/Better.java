package Arrays.Move_Zeros_To_End;

import java.util.*;

public class Better {
    // Logic implementation
    public static int solve(int[] arr, int ignored) {
        int insert = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[insert];
                arr[insert] = arr[i];
                arr[i] = temp;
                insert++;
            }
        }
        return arr[0];
    }

    // Time Complexity: O(n)
    // Space Complexity: Depends on approach-specific extra data structures used

    public static void main(String[] args) {
        int[] sample = {3, 1, 2, 5, 4, 2};
        System.out.println("Sample output: " + solve(sample, 2));
    }
}
