package Arrays.Majority_Element_II;

import java.util.*;

public class Optimal {
    public static List<Integer> solve(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        // Extended Boyer-Moore for n/3 threshold.
        for (int value : nums) {
            if (value == candidate1) count1++;
            else if (value == candidate2) count2++;
            else if (count1 == 0) {
                candidate1 = value;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = value;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int value : nums) {
            if (value == candidate1) count1++;
            else if (value == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(candidate1);
        if (count2 > nums.length / 3) result.add(candidate2);
        return result;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 2, 3, 2, 2, 1, 1}));
    }
}
