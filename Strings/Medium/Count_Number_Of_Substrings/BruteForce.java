package Strings.Medium.Count_Number_Of_Substrings;

import java.util.*;

public class BruteForce {
    // Count substrings with exactly k distinct characters.
    public static int solve(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                set.add(s.charAt(j));
                if (set.size() == k) count++;
                if (set.size() > k) break;
            }
        }
        return count;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(k)
    public static void main(String[] args) {
        System.out.println(solve("pqpqs", 2));
    }
}
