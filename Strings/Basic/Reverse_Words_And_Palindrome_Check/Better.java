package Strings.Basic.Reverse_Words_And_Palindrome_Check;

import java.util.*;

public class Better {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            out.append(words[i]);
            if (i != 0) out.append(' ');
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
    // Space Complexity: O(n) for reverse words, O(1) for palindrome
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
