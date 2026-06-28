package Strings.Medium.Sort_Characters_By_Frequency;

import java.util.*;

public class BruteForce {
    public static String solve(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        StringBuilder out = new StringBuilder();
        while (!freq.isEmpty()) {
            char bestChar = 0;
            int bestFreq = -1;
            for (Map.Entry<Character, Integer> e : freq.entrySet()) {
                if (e.getValue() > bestFreq) {
                    bestFreq = e.getValue();
                    bestChar = e.getKey();
                }
            }
            for (int i = 0; i < bestFreq; i++) out.append(bestChar);
            freq.remove(bestChar);
        }
        return out.toString();
    }

    // Time Complexity: O(n * unique)
    // Space Complexity: O(unique)
    public static void main(String[] args) {
        System.out.println(solve("tree"));
    }
}
