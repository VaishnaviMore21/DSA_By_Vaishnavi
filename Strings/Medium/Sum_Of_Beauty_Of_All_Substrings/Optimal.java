package Strings.Medium.Sum_Of_Beauty_Of_All_Substrings;

import java.util.*;

public class Optimal {
    public static int solve(String s) {
        // For this Striver problem, O(n^2 * 26) is the expected optimal practical approach.
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int maxF = 0, minF = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxF = Math.max(maxF, f);
                        minF = Math.min(minF, f);
                    }
                }
                total += (maxF - minF);
            }
        }
        return total;
    }

    // Time Complexity: O(n^2 * 26)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("aabcb"));
    }
}
