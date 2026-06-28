package Arrays.Next_Permutation;

import java.util.*;

public class Better {
    public static int[] solve(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);

        int pivot = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            Arrays.sort(arr);
            return arr;
        }

        int successor = pivot + 1;
        for (int i = pivot + 1; i < arr.length; i++) {
            if (arr[i] > arr[pivot] && arr[i] <= arr[successor]) {
                successor = i;
            }
        }

        swap(arr, pivot, successor);
        Arrays.sort(arr, pivot + 1, arr.length);
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1, 2, 3})));
    }
}
