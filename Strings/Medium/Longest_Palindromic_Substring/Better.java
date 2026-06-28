package Strings.Medium.Longest_Palindromic_Substring;

import java.util.*;

public class Better {
    public static String solve(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) dp[i][i] = true;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (len > maxLen) {
                            maxLen = len;
                            start = i;
                        }
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)
    public static void main(String[] args) {
        System.out.println(solve("cbbd"));
    }
}
