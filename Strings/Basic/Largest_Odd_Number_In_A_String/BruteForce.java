package Strings.Basic.Largest_Odd_Number_In_A_String;

import java.util.*;

public class BruteForce {
    public static String solve(String num) {
        // Check all prefixes from largest length to smallest.
        for (int len = num.length(); len >= 1; len--) {
            String prefix = num.substring(0, len);
            char last = prefix.charAt(prefix.length() - 1);
            if ((last - '0') % 2 == 1) return prefix;
        }
        return "";
    }

    // Time Complexity: O(n^2) due to substring creation in loop
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("35427"));
    }
}
