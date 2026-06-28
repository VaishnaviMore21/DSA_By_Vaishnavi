package Recursion.Backtracking.Expression_Add_Operators;

import java.util.*;

public class Better {
    private static void dfs(int index, int n, String current, List<String> out) {
        // Recursion flow: prune branches early when constraints break.
        if (current.contains("11")) {
            return;
        }
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

    // Time Complexity: O(2^n) with pruning in many cases
    // Space Complexity: O(n) recursion stack
    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
