package Arrays.Next_Permutation;

import java.util.*;

public class BruteForce {
    public static int[] solve(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        List<int[]> perms = new ArrayList<>();
        do {
            perms.add(Arrays.copyOf(copy, copy.length));
        } while (nextLex(copy));

        for (int i = 0; i < perms.size(); i++) {
            if (Arrays.equals(perms.get(i), nums)) {
                return Arrays.copyOf(perms.get((i + 1) % perms.size()), nums.length);
            }
        }
        return nums;
    }

    private static boolean nextLex(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0) return false;
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        return true;
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) swap(arr, l++, r--);
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }

    // Time Complexity: O(n! * n)
    // Space Complexity: O(n! * n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1, 2, 3})));
    }
}
