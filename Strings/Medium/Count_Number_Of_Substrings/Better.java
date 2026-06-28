package Strings.Medium.Count_Number_Of_Substrings;

import java.util.*;

public class Better {
    private static int atMostK(String s, int k) {
        if (k < 0) return 0;
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char l = s.charAt(left++);
                freq.put(l, freq.get(l) - 1);
                if (freq.get(l) == 0) freq.remove(l);
            }
            ans += (right - left + 1);
        }
        return ans;
    }

    public static int solve(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(k)
    public static void main(String[] args) {
        System.out.println(solve("pqpqs", 2));
    }
}
