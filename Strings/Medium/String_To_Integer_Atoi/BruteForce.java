package Strings.Medium.String_To_Integer_Atoi;

import java.util.*;

public class BruteForce {
    public static int solve(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int idx = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = s.charAt(0) == '-' ? -1 : 1;
            idx++;
        }

        StringBuilder digits = new StringBuilder();
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            digits.append(s.charAt(idx));
            idx++;
        }

        if (digits.length() == 0) return 0;
        try {
            long value = Long.parseLong(digits.toString()) * sign;
            if (value > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (value < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return (int) value;
        } catch (Exception e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("   -42"));
    }
}
