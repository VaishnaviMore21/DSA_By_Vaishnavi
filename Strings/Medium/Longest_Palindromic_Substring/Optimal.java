package Strings.Medium.Longest_Palindromic_Substring;

import java.util.*;

public class Optimal {
    private static int[] expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return new int[]{l + 1, r - 1};
    }

    public static String solve(String s) {
        int bestL = 0, bestR = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] odd = expand(s, i, i);
            int[] even = expand(s, i, i + 1);

            if (odd[1] - odd[0] > bestR - bestL) {
                bestL = odd[0];
                bestR = odd[1];
            }
            if (even[1] - even[0] > bestR - bestL) {
                bestL = even[0];
                bestR = even[1];
            }
        }
        return s.substring(bestL, bestR + 1);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("forgeeksskeegfor"));
    }
}
