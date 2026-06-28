package Strings.Basic.Rotate_String;

import java.util.*;

public class BruteForce {
    public static boolean solve(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String current = s;

        // Try all left rotations.
        for (int i = 0; i < s.length(); i++) {
            if (current.equals(goal)) return true;
            current = current.substring(1) + current.charAt(0);
        }
        return false;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("abcde", "cdeab"));
    }
}
