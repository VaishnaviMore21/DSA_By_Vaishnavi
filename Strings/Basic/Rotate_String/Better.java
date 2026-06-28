package Strings.Basic.Rotate_String;

import java.util.*;

public class Better {
    public static boolean solve(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }

    // Time Complexity: O(n^2) in worst case for contains implementation
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("abcde", "abced"));
    }
}
