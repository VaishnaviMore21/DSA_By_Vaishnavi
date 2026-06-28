package Arrays.Sort_Array_Of_0_1_2;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] arr) {
        int[] nums = Arrays.copyOf(arr, arr.length);
        int low = 0, mid = 0, high = nums.length - 1;

        // Dutch National Flag partitioning.
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) because we return a copy for safe demo
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{2, 0, 2, 1, 1, 0})));
    }
}
