package Strings.Medium.Sort_Characters_By_Frequency;

import java.util.*;

public class Optimal {
    public static String solve(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        // Bucket by frequency.
        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            int f = e.getValue();
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(e.getKey());
        }

        StringBuilder out = new StringBuilder();
        for (int f = s.length(); f >= 1; f--) {
            if (bucket[f] == null) continue;
            for (char ch : bucket[f]) {
                for (int i = 0; i < f; i++) out.append(ch);
            }
        }
        return out.toString();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("Aabb"));
    }
}
