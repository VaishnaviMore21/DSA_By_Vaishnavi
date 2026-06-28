package Strings.Basic.Remove_Outermost_Parentheses;

import java.util.*;

public class BruteForce {
    public static String solve(String s) {
        List<String> primitives = new ArrayList<>();
        int balance = 0;
        int start = 0;

        // Split into primitive valid parentheses parts.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') balance++;
            else balance--;

            if (balance == 0) {
                primitives.add(s.substring(start, i + 1));
                start = i + 1;
            }
        }

        StringBuilder out = new StringBuilder();
        for (String p : primitives) {
            out.append(p, 1, p.length() - 1);
        }
        return out.toString();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("(()())(())"));
    }
}
