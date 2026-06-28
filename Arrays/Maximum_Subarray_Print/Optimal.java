package Arrays.Maximum_Subarray_Print;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] nums) {
        int currentSum = nums[0], maxSum = nums[0];
        int start = 0, bestStart = 0, bestEnd = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                start = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = start;
                bestEnd = i;
            }
        }

        return Arrays.copyOfRange(nums, bestStart, bestEnd + 1);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) for output slice
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})));
    }
}
