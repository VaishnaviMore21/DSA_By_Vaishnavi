package Arrays.Two_Sum;

import java.util.*;

public class Better {
    public static int[] solve(int[] nums, int target) {
        // Sort value-index pairs, then use two pointers.
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            }
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        int[] ans = solve(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ans));
    }
}
