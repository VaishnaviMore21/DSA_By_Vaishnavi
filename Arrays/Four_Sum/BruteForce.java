package Arrays.Four_Sum;

import java.util.*;

public class BruteForce {
    public static List<List<Integer>> solve(int[] nums, int target) {
        Set<String> uniq = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if ((long) nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            int[] quad = new int[]{nums[i], nums[j], nums[k], nums[l]};
                            Arrays.sort(quad);
                            String key = quad[0] + ":" + quad[1] + ":" + quad[2] + ":" + quad[3];
                            if (uniq.add(key)) {
                                ans.add(Arrays.asList(quad[0], quad[1], quad[2], quad[3]));
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    // Time Complexity: O(n^4)
    // Space Complexity: O(k)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
