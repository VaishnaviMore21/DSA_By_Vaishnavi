package Arrays.Longest_Consecutive_Sequence;

import java.util.*;

public class Better {
    public static int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value : nums) set.add(value);

        int best = 0;
        for (int value : set) {
            int length = 1;
            int next = value + 1;
            while (set.contains(next)) {
                length++;
                next++;
            }
            best = Math.max(best, length);
        }
        return best;
    }

    // Time Complexity: O(n^2) in worst case due to repeated chains
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
