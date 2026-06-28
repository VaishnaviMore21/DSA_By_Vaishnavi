package Arrays.Maximum_Product_Subarray;

import java.util.*;

public class Optimal {
    public static int solve(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (value < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(value, maxEnding * value);
            minEnding = Math.min(value, minEnding * value);
            answer = Math.max(answer, maxEnding);
        }
        return answer;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 3, -2, 4}));
    }
}
