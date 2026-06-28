package Strings.Medium.Sort_Characters_By_Frequency;

import java.util.*;

public class Better {
    public static String solve(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder out = new StringBuilder();
        for (char ch : chars) {
            for (int i = 0; i < freq.get(ch); i++) out.append(ch);
        }
        return out.toString();
    }

    // Time Complexity: O(n + u log u)
    // Space Complexity: O(u)
    public static void main(String[] args) {
        System.out.println(solve("cccaaa"));
    }
}
