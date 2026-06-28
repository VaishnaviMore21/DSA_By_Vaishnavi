package Recursion.Subsequences.Power_Set;

import java.util.*;

public class Optimal {
    private static int countWays(int n, Map<Integer, Integer> memo) {
        // Recursion flow: solve smaller subproblems and reuse memoized answers.
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ways = countWays(n - 1, memo) + countWays(n - 2, memo);
        memo.put(n, ways);
        return ways;
    }

    public static String solve(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return String.valueOf(countWays(n, memo));
    }

    // Time Complexity: O(n) to O(2^n) depending on pruning/memoization
    // Space Complexity: O(n) for recursion stack / memo as used
    public static void main(String[] args) {
        System.out.println(solve(6));
    }
}
