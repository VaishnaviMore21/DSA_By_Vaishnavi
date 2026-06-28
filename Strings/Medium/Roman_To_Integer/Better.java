package Strings.Medium.Roman_To_Integer;

import java.util.*;

public class Better {
    private static int value(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int solve(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) ans -= current;
            else ans += current;
        }
        return ans;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("LVIII"));
    }
}
