package Arrays.Next_Permutation;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);

        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }

        // Suffix is decreasing, reverse to make smallest order.
        reverse(arr, i + 1, arr.length - 1);
        return arr;
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) swap(arr, l++, r--);
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1, 2, 3})));
    }
}
