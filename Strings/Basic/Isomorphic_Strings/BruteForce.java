package Strings.Basic.Isomorphic_Strings;

import java.util.*;

public class BruteForce {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;

        // Verify one-to-one mapping by checking all previous positions.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean sameS = s.charAt(i) == s.charAt(j);
                boolean sameT = t.charAt(i) == t.charAt(j);
                if (sameS != sameT) return false;
            }
        }
        return true;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("egg", "add"));
    }
}
