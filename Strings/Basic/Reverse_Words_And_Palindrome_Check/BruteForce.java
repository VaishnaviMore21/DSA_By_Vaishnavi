package Strings.Basic.Reverse_Words_And_Palindrome_Check;

import java.util.*;

public class BruteForce {
    public static String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        List<String> list = Arrays.asList(parts);
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
