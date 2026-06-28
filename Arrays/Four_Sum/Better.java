package Arrays.Four_Sum;

import java.util.*;

public class Better {
    public static List<List<Integer>> solve(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    long needed = (long) target - nums[i] - nums[j] - nums[k];
                    if (needed >= Integer.MIN_VALUE && needed <= Integer.MAX_VALUE && seen.contains((int) needed)) {
                        int[] quad = new int[]{nums[i], nums[j], nums[k], (int) needed};
                        Arrays.sort(quad);
                        set.add(Arrays.asList(quad[0], quad[1], quad[2], quad[3]));
                    }
                    seen.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(n + k)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
