package Strings.Basic.Largest_Odd_Number_In_A_String;

import java.util.*;

public class Better {
    public static String solve(String num) {
        // Scan from right for first odd digit.
        for (int i = num.length() - 1; i >= 0; i--) {
            if (((num.charAt(i) - '0') & 1) == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) for returned substring
    public static void main(String[] args) {
        System.out.println(solve("4206"));
        System.out.println(solve("35427"));
    }
}
