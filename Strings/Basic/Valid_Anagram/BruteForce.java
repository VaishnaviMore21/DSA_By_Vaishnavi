package Strings.Basic.Valid_Anagram;

import java.util.*;

public class BruteForce {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("anagram", "nagaram"));
    }
}
