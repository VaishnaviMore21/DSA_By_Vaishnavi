package Arrays.Count_Subarrays_With_XOR_K;

import java.util.*;

public class Better {
    public static int solve(int[] nums, int k) {
        int n = nums.length;
        int[] prefixXor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ nums[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xr = prefixXor[j + 1] ^ prefixXor[i];
                if (xr == k) count++;
            }
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 2, 2, 6, 4}, 6));
    }
}
