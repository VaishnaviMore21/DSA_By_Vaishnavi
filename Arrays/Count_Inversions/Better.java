package Arrays.Count_Inversions;

import java.util.*;

public class Better {
    public static long solve(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        long count = 0;

        // Insertion sort shift count equals inversion count.
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                count++;
            }
            arr[j + 1] = key;
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 3, 2, 4, 1}));
    }
}
