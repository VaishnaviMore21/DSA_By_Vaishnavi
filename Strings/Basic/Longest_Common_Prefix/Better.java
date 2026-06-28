package Strings.Basic.Longest_Common_Prefix;

import java.util.*;

public class Better {
    public static String solve(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                if (prefix.isEmpty()) return "";
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    // Time Complexity: O(n * m)
    // Space Complexity: O(m)
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"flower", "flow", "flight"}));
    }
}
