package Strings.Basic.Reverse_Words_And_Palindrome_Check;

import java.util.*;

public class Optimal {
    public static String reverseWords(String s) {
        // Build words manually and output in reverse.
        List<String> words = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') i++;
            if (i >= s.length()) break;
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') j++;
            words.add(s.substring(i, j));
            i = j;
        }

        StringBuilder out = new StringBuilder();
        for (int k = words.size() - 1; k >= 0; k--) {
            out.append(words.get(k));
            if (k != 0) out.append(' ');
        }
        return out.toString();
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world from java"));
        System.out.println(isPalindrome("race a car"));
    }
}
