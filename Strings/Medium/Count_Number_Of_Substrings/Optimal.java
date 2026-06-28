package Strings.Medium.Count_Number_Of_Substrings;

import java.util.*;

public class Optimal {
    private static int atMostK(String s, int k) {
        if (k < 0) return 0;
        int[] freq = new int[256];
        int distinct = 0, left = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (freq[s.charAt(right)]++ == 0) distinct++;

            while (distinct > k) {
                if (--freq[s.charAt(left)] == 0) distinct--;
                left++;
            }
            ans += (right - left + 1);
        }
        return ans;
    }

    public static int solve(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) for fixed charset
    public static void main(String[] args) {
        System.out.println(solve("aabcbcdbca", 2));
    }
}
