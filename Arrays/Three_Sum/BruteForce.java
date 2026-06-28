package Arrays.Three_Sum;

import java.util.*;

public class BruteForce {
    public static List<List<Integer>> solve(int[] nums) {
        Set<String> seen = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] trip = new int[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(trip);
                        String key = trip[0] + ":" + trip[1] + ":" + trip[2];
                        if (seen.add(key)) {
                            ans.add(Arrays.asList(trip[0], trip[1], trip[2]));
                        }
                    }
                }
            }
        }
        return ans;
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(k)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
