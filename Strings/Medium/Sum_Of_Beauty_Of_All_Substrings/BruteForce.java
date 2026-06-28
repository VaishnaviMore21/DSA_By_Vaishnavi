package Strings.Medium.Sum_Of_Beauty_Of_All_Substrings;

import java.util.*;

public class BruteForce {
    public static int solve(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int[] freq = new int[26];
                for (int k = i; k <= j; k++) freq[s.charAt(k) - 'a']++;
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

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("aabcb"));
    }
}
