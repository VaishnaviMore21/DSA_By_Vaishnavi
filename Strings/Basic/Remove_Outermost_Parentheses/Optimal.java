package Strings.Basic.Remove_Outermost_Parentheses;

import java.util.*;

public class Optimal {
    public static String solve(String s) {
        // Same as better: single pass with depth counter.
        StringBuilder out = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) out.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) out.append(ch);
            }
        }
        return out.toString();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("(()())(())"));
    }
}
