package Arrays.Reverse_Pairs;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;
        int mid = low + (high - low) / 2;
        int count = 0;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        while (left <= mid) temp.add(arr[left++]);
        while (right <= high) temp.add(arr[right++]);

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 2, 3, 1}));
    }
}
