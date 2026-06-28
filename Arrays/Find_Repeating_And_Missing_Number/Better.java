package Arrays.Find_Repeating_And_Missing_Number;

import java.util.*;

public class Better {
    public static int[] solve(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int x : nums) freq[x]++;

        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) repeating = i;
            else if (freq[i] == 0) missing = i;
        }
        return new int[]{repeating, missing};
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, 2, 5, 3})));
    }
}
