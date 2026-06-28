package Strings.Medium.Maximum_Nesting_Depth_Of_Parentheses;

import java.util.*;

public class BruteForce {
    public static int solve(String s) {
        int maxDepth = 0;

        // For each '(', find depth by scanning prefix.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int depth = 0;
                for (int j = 0; j <= i; j++) {
                    if (s.charAt(j) == '(') depth++;
                    else if (s.charAt(j) == ')') depth--;
                }
                maxDepth = Math.max(maxDepth, depth);
            }
        }
        return maxDepth;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("(1+(2*3)+((8)/4))+1"));
    }
}
