package Strings.Basic.Longest_Common_Prefix;

import java.util.*;

public class Optimal {
    public static String solve(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    // Time Complexity: O(n log n + m)
    // Space Complexity: O(1) extra (ignoring sort internals)
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"flower", "flow", "flight"}));
    }
}
