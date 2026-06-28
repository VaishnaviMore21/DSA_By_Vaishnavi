package Strings.Basic.Valid_Anagram;

import java.util.*;

public class Optimal {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int x : freq) {
            if (x != 0) return false;
        }
        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("listen", "silent"));
    }
}
