package Strings.Medium.Maximum_Nesting_Depth_Of_Parentheses;

import java.util.*;

public class Optimal {
    public static int solve(String s) {
        int depth = 0, maxDepth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') maxDepth = Math.max(maxDepth, ++depth);
            else if (ch == ')') depth--;
        }
        return maxDepth;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("()(())"));
    }
}
