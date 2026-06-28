package Strings.Basic.Valid_Anagram;

import java.util.*;

public class Better {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        for (char ch : t.toCharArray()) {
            if (!freq.containsKey(ch)) return false;
            freq.put(ch, freq.get(ch) - 1);
            if (freq.get(ch) == 0) freq.remove(ch);
        }
        return freq.isEmpty();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("rat", "car"));
    }
}
