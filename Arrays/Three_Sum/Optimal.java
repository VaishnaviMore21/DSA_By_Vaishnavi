package Arrays.Three_Sum;

import java.util.*;

public class Optimal {
    public static List<List<Integer>> solve(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1) excluding output
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
