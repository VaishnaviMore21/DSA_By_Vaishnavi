package Strings.Medium.Longest_Palindromic_Substring;

import java.util.*;

public class BruteForce {
    private static boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static String solve(String s) {
        String best = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPal(s, i, j) && (j - i + 1) > best.length()) {
                    best = s.substring(i, j + 1);
                }
            }
        }
        return best;
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("babad"));
    }
}
