package Strings.Medium.Roman_To_Integer;

import java.util.*;

public class Optimal {
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
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));
            if (curr < prev) total -= curr;
            else total += curr;
            prev = curr;
        }
        return total;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("MCMXCIV"));
    }
}
