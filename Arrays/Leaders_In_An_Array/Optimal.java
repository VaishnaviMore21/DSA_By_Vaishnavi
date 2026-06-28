package Arrays.Leaders_In_An_Array;

import java.util.*;

public class Optimal {
    public static List<Integer> solve(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{16, 17, 4, 3, 5, 2}));
    }
}
