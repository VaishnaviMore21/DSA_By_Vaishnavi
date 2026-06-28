package Recursion.Subsequences.Combination_Sum;

import java.util.*;

public class BruteForce {
    private static void dfs(int index, int n, String current, List<String> out) {
        // Recursion flow: choose one branch and recurse deeper.
        if (index == n) {
            out.add(current);
            return;
        }

        dfs(index + 1, n, current + "0", out);
        dfs(index + 1, n, current + "1", out);
    }

    public static String solve(int n) {
        List<String> out = new ArrayList<>();
        dfs(0, n, "", out);
        return out.toString();
    }

    // Time Complexity: O(2^n) baseline recursive exploration
    // Space Complexity: O(n) recursion tree depth + output storage
    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
