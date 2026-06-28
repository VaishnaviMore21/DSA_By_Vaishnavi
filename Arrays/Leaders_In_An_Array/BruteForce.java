package Arrays.Leaders_In_An_Array;

import java.util.*;

public class BruteForce {
    public static List<Integer> solve(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) leaders.add(nums[i]);
        }
        return leaders;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{16, 17, 4, 3, 5, 2}));
    }
}
