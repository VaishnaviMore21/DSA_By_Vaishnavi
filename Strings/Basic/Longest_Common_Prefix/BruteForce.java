package Strings.Basic.Longest_Common_Prefix;

import java.util.*;

public class BruteForce {
    public static String solve(String[] strs) {
        if (strs.length == 0) return "";
        String first = strs[0];

        // Check each prefix of first string.
        for (int len = first.length(); len >= 0; len--) {
            String prefix = first.substring(0, len);
            boolean ok = true;
            for (String s : strs) {
                if (!s.startsWith(prefix)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return prefix;
        }
        return "";
    }

    // Time Complexity: O(n * m^2)
    // Space Complexity: O(m)
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"flower", "flow", "flight"}));
    }
}
