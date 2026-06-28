package Arrays.Count_Inversions;

import java.util.*;

public class Optimal {
    public static long solve(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;
        int mid = low + (high - low) / 2;
        long count = 0;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    private static long merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        long count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
                count += (mid - left + 1);
            }
        }

        while (left <= mid) temp.add(arr[left++]);
        while (right <= high) temp.add(arr[right++]);

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 3, 2, 4, 1}));
    }
}
