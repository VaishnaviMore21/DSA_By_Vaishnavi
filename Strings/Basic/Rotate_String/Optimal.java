package Strings.Basic.Rotate_String;

import java.util.*;

public class Optimal {
    public static boolean solve(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }

    // Time Complexity: O(n^2) worst case (library search dependent)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("abcde", "cdeab"));
    }
}
