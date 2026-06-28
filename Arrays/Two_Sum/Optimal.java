package Arrays.Two_Sum;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] nums, int target) {
        // Store needed complement in hash map.
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (indexMap.containsKey(needed)) {
                return new int[]{indexMap.get(needed), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        int[] ans = solve(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ans));
    }
}
