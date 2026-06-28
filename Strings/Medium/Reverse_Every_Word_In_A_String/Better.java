package Strings.Medium.Reverse_Every_Word_In_A_String;

import java.util.*;

public class Better {
    public static String solve(String s) {
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                out.append(' ');
                i++;
                continue;
            }
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') j++;
            for (int k = j - 1; k >= i; k--) out.append(s.charAt(k));
            i = j;
        }
        return out.toString();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve("Hello Java World"));
    }
}
