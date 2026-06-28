package Strings.Medium.String_To_Integer_Atoi;

import java.util.*;

public class Optimal {
    public static int solve(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Overflow guard before multiplication.
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("-91283472332"));
    }
}
