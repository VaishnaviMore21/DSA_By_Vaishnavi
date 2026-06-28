package Strings.Medium.Roman_To_Integer;

import java.util.*;

public class BruteForce {
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

        // Replace subtraction patterns first.
        total += 4 * countAndRemove(s, "IV");
        total += 9 * countAndRemove(s, "IX");
        total += 40 * countAndRemove(s, "XL");
        total += 90 * countAndRemove(s, "XC");
        total += 400 * countAndRemove(s, "CD");
        total += 900 * countAndRemove(s, "CM");

        for (char ch : s.toCharArray()) total += value(ch);
        return total;
    }

    private static int countAndRemove(String s, String token) {
        int count = 0;
        int idx = s.indexOf(token);
        while (idx != -1) {
            count++;
            idx = s.indexOf(token, idx + 2);
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("MCMXCIV"));
    }
}
