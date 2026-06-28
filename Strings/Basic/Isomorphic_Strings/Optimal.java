package Strings.Basic.Isomorphic_Strings;

import java.util.*;

public class Optimal {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (mapS[a] != mapT[b]) return false;
            mapS[a] = i + 1;
            mapT[b] = i + 1;
        }
        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve("paper", "title"));
    }
}
