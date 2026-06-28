package Arrays.Three_Sum;

import java.util.*;

public class Better {
    public static List<List<Integer>> solve(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (seen.contains(third)) {
                    int[] trip = new int[]{nums[i], nums[j], third};
                    Arrays.sort(trip);
                    set.add(Arrays.asList(trip[0], trip[1], trip[2]));
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n + k)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
