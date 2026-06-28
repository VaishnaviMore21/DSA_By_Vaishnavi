package Arrays.Count_Subarrays_With_Given_Sum;

import java.util.*;

public class Better {
    public static int solve(int[] nums, int k) {
        int count = 0;
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (prefix[j + 1] - prefix[i] == k) count++;
            }
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 1}, 2));
    }
}
