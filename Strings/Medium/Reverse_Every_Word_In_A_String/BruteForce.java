package Strings.Medium.Reverse_Every_Word_In_A_String;

import java.util.*;

public class BruteForce {
    public static String solve(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("Let's code together"));
    }
}
