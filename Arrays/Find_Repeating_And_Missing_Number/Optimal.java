package Arrays.Find_Repeating_And_Missing_Number;

import java.util.*;

public class Optimal {
    public static int[] solve(int[] nums) {
        long n = nums.length;
        long sumN = n * (n + 1) / 2;
        long sumSqN = n * (n + 1) * (2 * n + 1) / 6;

        long arrSum = 0, arrSqSum = 0;
        for (int x : nums) {
            arrSum += x;
            arrSqSum += 1L * x * x;
        }

        long diff = arrSum - sumN; // repeating - missing
        long sumDiff = (arrSqSum - sumSqN) / diff; // repeating + missing

        int repeating = (int) ((diff + sumDiff) / 2);
        int missing = (int) (sumDiff - repeating);
        return new int[]{repeating, missing};
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 1, 2, 5, 3})));
    }
}
